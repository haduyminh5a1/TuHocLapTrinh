package PayrollManagement;

public class FullTimeEmployee extends Employee implements Taxes {


    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    @Override
    public double salaryCalculate() {
        return fulltimeSalary + fulltimeSalary*0.1;
    }

    @Override
    public double calculateTax(double salary){
        return salary * TAX_RATE;
    }

}
