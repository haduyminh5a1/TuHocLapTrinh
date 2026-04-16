package JavaNangCao.JavaAdvancedLearn.Optionals;
import JavaNangCao.JavaAdvancedLearn.Optionals.*;

public class Main {
    public static void main(String[] args) {
        BookOptionals service = new BookOptionals();

        System.out.println("--- Tim sach ---");
        service.findBookByTitle("Clean Code")
                .map(Book::getPrice) 
                .ifPresent(price -> System.out.println("Gia sach la: $" + price));

        System.out.println("\n--- Tim sach Python Basics ---");
        String result = service.findBookByTitle("Python Basics")
                .map(Book::getTitle)
                .orElse("Khong tim thay sach");
        
        System.out.println(result);

        try {
            Book book = service.findBookByTitle("C++ Advanced")
                    .orElseThrow(() -> new RuntimeException("Sach khong ton tai!"));
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }
}
