package JavaNangCao.LambdaEx;

public class Product {
    String name;
    double price;
    String category;

    //Constructor
    public Product(String name, double price, String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    //Getters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    //Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    @Override
    public String toString(){
        return name + " (" + category + "): $" + price;
    }

    

}
