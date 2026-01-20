package BaiTap.BaiTrenLop;

public class ProductionWorker extends Employee {
    public static final int DAY_SHIFT = 1;
    public static final int NIGHT_SHIFT = 2;

    protected int shift;
    protected double payRate;
    public ProductionWorker(String ename, String enumber, String hireDate, int shift, double payRate) {
        super(ename, enumber, hireDate);
        this.shift = shift;
        this.payRate = payRate;
    }
    //Getters
    public int getShift() {
        return shift;
    }
    public double getPayRate() {
        return payRate;
    }
    //Setters
    public void setShift(int shift) {
        this.shift = shift;
    }
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    
}
