package PayrollManagement;

public class Contractor extends Employee implements Taxes {
    public enum Shift {
        DAYSHIFT(1.0), 
        NIGHTSHIFT(1.5);

        private final double rate;
        Shift(double rate) {this.rate = rate;}
        public double getRate(){ return rate;}
    }

    private Shift shift;
    private int workHours;

    public Contractor(String id, String name, Shift shift, int workHours) {
        super(id, name);
        this.shift = shift;
        this.workHours = workHours;
    }

    @Override
    public double salaryCalculate(){
        return contractorSalary * workHours * shift.getRate();
    }
    @Override
    public double calculateTax(double salary){
        return salary * TAX_RATE;
    }

}
