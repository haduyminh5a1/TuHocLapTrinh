package JavaNangCao.LambdaEx;
import java.util.*;

public class Demo {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Laptop", 1200, "Electronics"),
            new Product("Mouse", 25, "Electronics"),
            new Product("Phone", 800, "Electronics"),
            new Product("Table", 150, "Furniture"),
            new Product("Chair", 80, "Furniture")
        );
        
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(product -> product.price = product.price * 1.1);
        
    }
}
