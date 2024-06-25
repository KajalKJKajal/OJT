package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employee {
    private static final String URL = "jdbc:mysql://localhost:3306/myemp";
    private static final String USER = "root";
    private static final String PASSWORD = "nsti";

    public static void main(String[] args) {
        // Uncomment the createUser method calls if you want to insert new employees
//        int empid1 = 5;
//        String fname1 = "anitha";
//        String lname1 = "s";
//        String email1 = "anitha@gmail.com";
//        String hiredate1 = "2023-07-01";
//        createUser(empid1, fname1, lname1, email1, hiredate1);
//
//        int empid2 = 6;
//        String fname2 = "john";
//        String lname2 = "doe";
//        String email2 = "john.doe@gmail.com";
//        String hiredate2 = "2023-07-02";
//        createUser(empid2, fname2, lname2, email2, hiredate2);

        readUsers();
        readEmployeesHiredIn2023();
        updateUserEmail(1, "john.doe@company.com");
        updateHireDateForLastName("anitha", "2023-01-01");
        deleteEmployee(3);
        deleteEmployeesHiredBefore("2024-03-15");
    }

    private static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void createUser(int id, String fname, String lname, String email, String hiredate) {
        String query = "INSERT INTO employees (empid, fname, lname, email, hiredate) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, fname);
            ps.setString(3, lname);
            ps.setString(4, email);
            ps.setString(5, hiredate);
            int rowsInserted = ps.executeUpdate();
            System.out.println("Rows inserted: " + rowsInserted);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readUsers() {
        String query = "SELECT * FROM employees";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            System.out.println("***************************");
            System.out.println("Employee Details:");
            while (rs.next()) {
                int id = rs.getInt("empid");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String email = rs.getString("email");
                String hiredate = rs.getString("hiredate");
                System.out.println("EmpID: " + id + ", First Name: " + fname + ", Last Name: " + lname + ", Email: " + email + ", Hire Date: " + hiredate);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateUserEmail(int id, String email) {
        String query = "UPDATE employees SET email = ? WHERE empid = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, email);
            ps.setInt(2, id);
            int rowsUpdated = ps.executeUpdate();
            System.out.println("***************************");
            System.out.println("Rows updated: " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void readEmployeesHiredIn2023() {
        String query = "SELECT fname, lname FROM employees WHERE YEAR(hiredate) = 2023";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            System.out.println("***************************");
            System.out.println("Employees Hired in 2023:");
            while (rs.next()) {
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                System.out.println("First Name: " + fname + ", Last Name: " + lname);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateHireDateForLastName(String fname, String newHireDate) {
         System.out.println("***************************");
        System.out.println("update the HireDate of all employees who have LastName = 'Doe' to '2023-07-01'.");
        String query = "UPDATE employees SET hiredate = ? WHERE fname = ?";
        try (Connection conn = getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, newHireDate);
            ps.setString(2, fname);
            int rowsUpdated = ps.executeUpdate();
            System.out.println("***************************");
            System.out.println("Rows updated for employee with fname '" + fname + "': " + rowsUpdated);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void deleteEmployee(int empid) {
        System.out.println("*****************************");
        System.out.println("deleteEmployee(int empid)");
    String query = "DELETE FROM employees WHERE empid = ?";
    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setInt(1, empid);
        int rowsDeleted = ps.executeUpdate();
        System.out.println("Rows deleted: " + rowsDeleted);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
    public static void deleteEmployeesHiredBefore(String hiredate) {
        System.out.println("**************************************");
        System.out.println("delete all employees who were hired before '2023-01-01'.");
    String query = "DELETE FROM employees WHERE hiredate < ?";
    try (Connection conn = getConnection();
         PreparedStatement ps = conn.prepareStatement(query)) {
        ps.setString(1, hiredate);
        int rowsDeleted = ps.executeUpdate();
        System.out.println("Rows deleted: " + rowsDeleted);
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
