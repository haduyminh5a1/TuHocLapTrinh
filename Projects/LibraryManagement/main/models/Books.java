package Projects.LibraryManagement.main.models;
import Projects.LibraryManagement.main.core.Document;

public class Books extends Document{
    private String author;

    public Books(String id, String title, String author) {
        super(id, title);
        this.author = author;
    }
    
    public double calculateLateFee(int days){
        if (days > 0 && days <= 30){
            return 7 * 2000 + (days - 7) * 5000;
        }
        if (days > 30) return 200000;
        return 0;
    }
}
