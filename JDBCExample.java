package com.tutorial.DSA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCExample {
    // Database credentials (replace with your values)
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";
    public static void main(String[] args) {
        try {
            // 1. Load and register JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. Establish connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                System.out.println("Connected to database!");
                // Create table if not exists
                createTable(connection);
                // Insert data
                int newId = insertData(connection, "John Doe", 30);
                System.out.println("Inserted record with ID: " + newId);
                // Read data
                readData(connection);
                // Update data
                updateData(connection, newId, "John Smith", 35);
                // Delete data
                deleteData(connection, newId);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    private static void createTable(Connection connection) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS users (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(100) NOT NULL," +
                     "age INT)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(sql);
            System.out.println("Table created/verified");
        }
    }
    private static int insertData(Connection connection, String name, int age) throws SQLException {
        String sql = "INSERT INTO users (name, age) VALUES (?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, name);
            statement.setInt(2, age);
            statement.executeUpdate();
            try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1);
                }
            }
        }
        return -1;
    }
    private static void readData(Connection connection) throws SQLException {
        String sql = "SELECT * FROM users";      
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {           
            System.out.println("\nUser List:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.printf("ID: %d, Name: %s, Age: %d%n", id, name, age);
            }
        }
    }
    private static void updateData(Connection connection, int id, String newName, int newAge) throws SQLException {
        String sql = "UPDATE users SET name = ?, age = ? WHERE id = ?";   
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, newName);
            statement.setInt(2, newAge);
            statement.setInt(3, id);
            int rowsAffected = statement.executeUpdate();
            System.out.println("Updated rows: " + rowsAffected);
        }
    }
    private static void deleteData(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";        
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, id);
            int rowsAffected = statement.executeUpdate();
            System.out.println("Deleted rows: " + rowsAffected);
        }
    }
}