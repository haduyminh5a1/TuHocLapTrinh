package PayrollManagement;

public abstract class Employee {
    private String id;
    private String name;
    static int employeeCount = 0;

    protected double fulltimeSalary = 1000d;
    protected double contractorSalary = 20d;

    public Employee(String id, String name){
        this.id = id;
        this.name = name;
        employeeCount++;
    }
    //Getters
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public static int getEmployeeCount() {
        return employeeCount;
    }

    //Setters
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setFulltimeSalary(double fulltimeSalary) {
        this.fulltimeSalary = fulltimeSalary;
    }
    public void setContractorSalary(double contractorSalary) {
        this.contractorSalary = contractorSalary;
    }


    //Salary calculate
    public abstract double salaryCalculate();
    //Get employee information
    public final String employeeInformation(){
        return "[ID : " + id + ", Name : " + name + " ]";
    }
}
