package JavaNangCao.Baitaptrenlop;

public class CashRegister {
    private RetailItem item;
    private int quantity;

    public CashRegister(RetailItem item, int quantity){
        this.item = item;
        this.quantity = quantity;
    }

    public double getSubtotal(){
        return item.getPrice() * quantity;
    }

    public double getTax(){
        return item.getPrice() * 0.06;
    }

    public double getTotal(){
        return getSubtotal() + getTax();
    }

    public double getUnitPrice() { return item.getPrice(); }
    public int getQuantity() { return quantity; }
}
