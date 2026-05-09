package JavaCoBan.Baitaptrenlop.Baionline.Bai1;

public class SavingsAccount extends BankAccount {
    private boolean active;

    public SavingsAccount(double balance, double annualInterestRate) {
        super(balance, annualInterestRate);
        if (super.getBalance() < 25.0) {
            this.active = false;
        } else {
            this.active = true;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (!active) {
            System.out.println("Transaction denied! The account is inactive due to a low balance.");
            return;
        }

        super.withdraw(amount);

        if (super.getBalance() < 25.0) {
            this.active = false;
            System.out.println("Warning: Account balance has fallen below $25. Account is now inactive.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (!active) {
            if (super.getBalance() + amount >= 25.0) {
                this.active = true;
                System.out.println("Account is now active again!");
            }
        }

        super.deposit(amount);
    }

    @Override
    public void monthlyProcess() {
        int withdrawals = super.getNumberOfWithdrawals();
        
        if (withdrawals > 4) {
            double extraCharges = (withdrawals - 4) * 1.0;
            double currentServiceCharge = super.getMonthlyServiceCharges();
            super.setMonthlyServiceCharges(currentServiceCharge + extraCharges);
        }

        super.monthlyProcess();

        if (super.getBalance() < 25.0) {
            this.active = false;
        }
    }

    public boolean isActive() {
        return active;
    }
}