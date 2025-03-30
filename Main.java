/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.List;
/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Add employees
        EmployeeDAO.addEmployee("Alice Cooper", "Developer", 70000);
        EmployeeDAO.addEmployee("Bob Marley", "Manager", 80000);

        // Update employee (Assuming an employee with ID 1 exists)
        boolean updateSuccess = EmployeeDAO.updateEmployee(1, "John Doe", "Senior Software Engineer", 90000);
        System.out.println(updateSuccess ? "Employee updated successfully." : "Employee update failed.");

        // Get all employees
        System.out.println("\n--- Employee List ---");
        List<Employee> employees = EmployeeDAO.getAllEmployees();
        employees.forEach(System.out::println);

        // Delete employee (Assuming an employee with ID 2 exists)
        boolean deleteSuccess = EmployeeDAO.deleteEmployee(2);
        System.out.println(deleteSuccess ? "Employee deleted successfully." : "Employee deletion failed.");
    }
    
}
