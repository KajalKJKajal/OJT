import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDB {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        String databaseName = "CustomerDB";
        String tableName = "Customers";

        try {
            // Establishing a connection
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // Create database
            createDatabase(connection, databaseName);

            // Use the new database
            connection.setCatalog(databaseName);

            // Create table
            createTable(connection, tableName);

            // Insert records
            createRecord(connection, tableName, "Anulekshmi", "Trivandrum");
            createRecord(connection, tableName, "Appu", "Kollam");
            createRecord(connection, tableName, "Manu", "Kochi");

            // Read operation
            readRecords(connection, tableName);

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Create a new database
    private static void createDatabase(Connection connection, String databaseName) throws SQLException {
        String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + databaseName;
        Statement statement = connection.createStatement();
        statement.executeUpdate(createDatabaseSQL);
        System.out.println("Database created successfully");
        System.out.println("*********************************************");
    }

    // Create a new table
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "customer_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "customer_name VARCHAR(100) NOT NULL, "
                + "city VARCHAR(100) NOT NULL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        System.out.println("Table created successfully");
        System.out.println("*********************************************");
    }

    // Create a new record
    private static void createRecord(Connection connection, String tableName, String customer_name, String city) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (customer_name, city) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, customer_name);
        preparedStatement.setString(2, city);
        preparedStatement.executeUpdate();


    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery();
        System.out.println("Customer Detailes");
        System.out.println("____________________________________________");

        while (resultSet.next()) {
            int customer_id = resultSet.getInt("customer_id");
            String customer_name = resultSet.getString("customer_name");
            String city = resultSet.getString("city");

            System.out.println("customer_id: " + customer_id + ", customer_name: " + customer_name + ", city: " + city);
        }
    }
}
