/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author User
 */
public class EmployeeDAO {
    // Add an employee to the database
    public static boolean addEmployee(String name, String position, double salary) {
        String sql = "INSERT INTO employees (name, position, salary) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, name);
            stmt.setString(2, position);
            stmt.setDouble(3, salary);
            
            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0; // Return true if insertion was successful
            
        } catch (SQLException e) {
            System.err.println("Error adding employee: " + e.getMessage());
            return false;
       
        }
        
    }
 // Read all employees
    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        String sql = "SELECT * FROM employees";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("position"),
                        rs.getDouble("salary")
                );
                employees.add(employee);
            }

        } catch (SQLException e) {
            System.err.println("Error retrieving employees: " + e.getMessage());
        }
        return employees;
    }
    
    // Update an employee&#39;s information
   public static boolean updateEmployee(int id, String name, String position, double salary) {
        String sql = "UPDATE employees SET name = ?, position = ?, salary = ? WHERE id = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, position);
            stmt.setDouble(3, salary);
            stmt.setInt(4, id);

            int rowsAffected = stmt.executeUpdate();
            
            return rowsAffected > 0; // Returns true if at least one row was updated

        } catch (SQLException e) {
            System.err.println("Error updating employee with ID " + id + ": " + e.getMessage());
            return false;
        }
    }
   
   // Delete an employee by ID
    public static boolean deleteEmployee(int id) {
        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0; // Returns true if at least one row was deleted

        } catch (SQLException e) {
            System.err.println("Error deleting employee with ID " + id + ": " + e.getMessage());
            return false;
        }
    }
    
}
