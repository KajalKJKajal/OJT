import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LibraryDB {
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static void main(String[] args) {
        String databaseName = "LibraryDB";
        String tableName = "Books";

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
            createRecord(connection, tableName, "HTML", "Tim Berners-Lee", 10);
            createRecord(connection, tableName, "Python", "Guido van Rossum", 15);
            createRecord(connection, tableName, "JAVA", "James Gosling", 5);

            // Read operation
            readRecords(connection, tableName);

            // Update operation
            updateRecord(connection, tableName, 1, "Effective Java", "Joshua Bloch", 12);

            // Delete operation
            deleteRecord(connection, tableName, 1);

            // Close the connection
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
        System.out.println("Library Database created successfully");
    }

    // Create a new table
    private static void createTable(Connection connection, String tableName) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS " + tableName + " ("
                + "book_id INT AUTO_INCREMENT PRIMARY KEY, "
                + "title VARCHAR(100) NOT NULL, "
                + "author VARCHAR(100) NOT NULL, "
                + "quantity INT NOT NULL)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTableSQL);
        System.out.println("BOOKS Table created successfully");
    }

    // Create a new record
    private static void createRecord(Connection connection, String tableName, String title, String author, int quantity) throws SQLException {
        String insertSQL = "INSERT INTO " + tableName + " (title, author, quantity) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertSQL);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, author);
        preparedStatement.setInt(3, quantity);
        preparedStatement.executeUpdate();

    }

    // Read records from the database
    private static void readRecords(Connection connection, String tableName) throws SQLException {
        String selectSQL = "SELECT * FROM " + tableName;
        PreparedStatement preparedStatement = connection.prepareStatement(selectSQL);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int book_id = resultSet.getInt("book_id");
            String title = resultSet.getString("title");
            String author = resultSet.getString("author");
            int quantity = resultSet.getInt("quantity");
            System.out.println("ID: " + book_id + ", Title: " + title + ", Author: " + author + ", Quantity: " + quantity);
        }
    }

    // Update an existing record
    private static void updateRecord(Connection connection, String tableName, int book_id, String title, String author, int quantity) throws SQLException {
        String updateSQL = "UPDATE " + tableName + " SET title = ?, author = ?, quantity = ? WHERE book_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(updateSQL);
        preparedStatement.setString(1, title);
        preparedStatement.setString(2, author);
        preparedStatement.setInt(3, quantity);
        preparedStatement.setInt(4, book_id);
        preparedStatement.executeUpdate();
        System.out.println("Record updated successfully");
    }

    // Delete a record from the database
    private static void deleteRecord(Connection connection, String tableName, int book_id) throws SQLException {
        String deleteSQL = "DELETE FROM " + tableName + " WHERE book_id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL);
        preparedStatement.setInt(1, book_id);
        preparedStatement.executeUpdate();
        System.out.println("Record deleted successfully");
    }
}
