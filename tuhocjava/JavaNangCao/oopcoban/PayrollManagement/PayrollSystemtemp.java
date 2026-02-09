package PayrollManagement;
import java.util.*;

public class PayrollSystemtemp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Employee> employeeList = new ArrayList<>();

        System.out.print("Please enter number of employees: ");
        int n = Integer.parseInt(input.nextLine());

        for (int i=0;i<n;i++){
            System.out.println("\n--- Employee #" + (i + 1) + " ---");
            System.out.print("Type (1-FullTime, 2-Contractor): ");
            int type = Integer.parseInt(input.nextLine());

            System.out.print("Enter ID: ");
            String id = input.nextLine();
            System.out.print("Enter Name: ");
            String name = input.nextLine();

            if (type == 1) {
                employeeList.add(new FullTimeEmployee(id, name));
            }
            else {
                System.out.print("Select Shift (1-DAY, 2-NIGHT): ");
                int s = Integer.parseInt(input.nextLine());
                Contractor.Shift shift = (s == 1) ? Contractor.Shift.DAYSHIFT : Contractor.Shift.NIGHTSHIFT;

                int workHours = Integer.parseInt(input.nextLine());
                employeeList.add(new Contractor(id, name, shift, workHours));
            }

            System.out.println("\n" + "=".repeat(40));
            System.out.printf("%-15s %-15s %-10s %-10s\n", "ID", "Name", "Salary", "Tax");
            
            for (Employee emp : employeeList) {
                double salary = emp.salaryCalculate();
                double tax = 0;
                if (emp instanceof Taxes) {
                    tax = ((Taxes) emp).calculateTax(salary);
                }
                System.out.printf("%-15s %-15s %-10.2f %-10.2f\n", 
                                emp.getId(), emp.getName(), salary, tax);
            }

            input.close();
        }
    }
}
