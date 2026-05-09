package JavaCoBan.Baitaptrenlop.Baionline.Bai2;

public class Customer extends Person{
    private int customerNumber;
    private boolean mailList;

    public Customer(String name, String address, String telephoneNumber, String customerNumber2, boolean mailList) {
        super(name, address, telephoneNumber);
        this.customerNumber = customerNumber2;
        this.mailList = mailList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailList() {
        return mailList;
    }

    public void setMailList(boolean mailList) {
        this.mailList = mailList;
    }
}
