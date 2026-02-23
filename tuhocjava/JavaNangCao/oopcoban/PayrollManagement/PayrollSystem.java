package PayrollManagement;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        
        // Input number of employees with validation
        int n = getIntInput("Enter number of employees: ", 1, 100);

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Input for Employee #" + (i + 1) + " ---");
            int type = getIntInput("Select Type (1-FullTime, 2-Contractor): ", 1, 2);

            String id = getStringInput("Enter ID: ");
            String name = getStringInput("Enter Name: ");

            if (type == 1) {
                // polymorphism: adding a subclass object to a superclass list
                employeeList.add(new FullTimeEmployee(id, name));
            } else {
                int s = getIntInput("Select Shift (1-DAY, 2-NIGHT): ", 1, 2);
                Contractor.Shift shift = (s == 1) ? Contractor.Shift.DAYSHIFT : Contractor.Shift.NIGHTSHIFT;
                int hours = getIntInput("Enter working hours (0-500): ", 0, 500);
                employeeList.add(new Contractor(id, name, shift, hours));
            }
        }

        displayPayroll(employeeList);
        System.out.println("\nTotal employees created in Heap: " + Employee.getEmployeeCount());

        // Ask user if they want to save data
        System.out.print("\nDo you want to save this payroll to CSV? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            saveToCSV(employeeList, "payroll.csv");
        }

        scanner.close();
    }

    // HELPER METHODS FOR VALIDATION

    // Validates integer inputs and handles NumberFormatException
    private static int getIntInput(String prompt, int min, int max) {
        int value;
        while (true) {
            try {
                System.out.print(prompt);
                value = Integer.parseInt(scanner.nextLine());
                if (value >= min && value <= max) break;
                System.out.println("Out of range! Enter a value between " + min + " and " + max);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a numeric value.");
            }
        }
        return value;
    }

    // Validates that string input is not empty or just whitespace
    private static String getStringInput(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) break;
            System.out.println("Error: Field cannot be empty.");
        }
        return input;
    }

    // Displays the results using Dynamic Binding and Casting
    private static void displayPayroll(ArrayList<Employee> list) {
        System.out.println("\n" + "=".repeat(50));
        System.out.printf("%-10s %-15s %-10s %-10s\n", "ID", "Name", "Salary", "Tax");
        System.out.println("-".repeat(50));
        
        for (Employee emp : list) {
            // Dynamic Binding: calls the correct calculateSalary() at runtime
            double salary = emp.salaryCalculate();
            
            // Downcasting: checking if employee implements Taxable
            double tax = 0;
            if (emp instanceof Taxes) {
                tax = ((Taxes) emp).calculateTax(salary);
            }
            
            System.out.printf("%-10s %-15s %-10.2f %-10.2f\n", 
                              emp.getId(), emp.getName(), salary, tax);
        }
    }
    private static void saveToCSV(ArrayList<Employee> list, String fileName) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            // Write CSV Header
            writer.println("ID,Name,Salary,Tax");
            
            for (Employee emp : list) {
                double salary = emp.salaryCalculate();
                double tax = (emp instanceof Taxes) ? ((Taxes) emp).calculateTax(salary) : 0;
                
                // Writing data in CSV format
                writer.printf("%s,%s,%.2f,%.2f\n", emp.getId(), emp.getName(), salary, tax);
            }
            System.out.println("Data successfully saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e.getMessage());
        }
    }
}