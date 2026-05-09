package JavaCoBan.Baitaptrenlop.Baionline.Bai1;

public class BankAccount {
    private double balance;
    private int depositTimes;
    private int withdrawalTimes;
    private double annualInterestRate;
    private double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate){
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.depositTimes = 0;
        this.withdrawalTimes = 0;
        this.monthlyServiceCharges = 0;
    }

    public void deposit(double amount){
        this.balance += amount;
        this.depositTimes++;
    }

    public void withdraw(double amount){
        this.balance -= amount;
        this.withdrawalTimes++;
    }

    public void calcInterest() {
        double monthlyInterestRate = this.annualInterestRate / 12;
        double monthlyInterest = this.balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public void monthlyProcess() {
        this.balance -= this.monthlyServiceCharges;
        this.calcInterest();

        this.depositTimes = 0;
        this.withdrawalTimes = 0;
        this.monthlyServiceCharges = 0;
    }

    public double getBalance() {
        return balance;
    }

    public int getNumberOfWithdrawals() {
        return withdrawalTimes;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }
}
