package JavaNangCao.Baitaptrenlop;

public class RetailItem {
    private static int count = 0;

    private String description;
    private int unitsOnHand;
    private double price;
    //Constructor
    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
        count++;
    }
    //Getter, Setter methods
    public static int getCount() {
        return count;
    }
    public static void setCount(int count) {
        RetailItem.count = count;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getUnitsOnHand() {
        return unitsOnHand;
    }
    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
