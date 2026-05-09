package JavaCoBan.Baitaptrenlop.Baionline.Bai2;

public class PreferredCustomer extends Customer {
    private double purchasesAmount;
    private double discountLevel;

    public PreferredCustomer(String name, String address, String telephoneNumber, String customerNumber2,
            boolean mailList) {
        super(name, address, telephoneNumber, customerNumber2, mailList);
        setPurchasesAmount(purchasesAmount);
    }

    public void setPurchasesAmount(double purchasesAmount) {
        this.purchasesAmount = purchasesAmount;
        if (purchasesAmount >= 2000) {
            this.discountLevel = 0.10; 
        } else if (purchasesAmount >= 1500) {
            this.discountLevel = 0.07;
        } else if (purchasesAmount >= 1000) {
            this.discountLevel = 0.06; 
        } else if (purchasesAmount >= 500) {
            this.discountLevel = 0.05; 
        } else {
            this.discountLevel = 0.0; 
        }
    }

    public double getPurchasesAmount() {
        return purchasesAmount;
    }

    public double getDiscountLevel() {
        return discountLevel;
    }
    public String toString() {
        return super.toString() + 
               "\nPurchase amount: $" + purchasesAmount +
               "\nDiscount level: " + (discountLevel * 100) + "%";
    }
}
