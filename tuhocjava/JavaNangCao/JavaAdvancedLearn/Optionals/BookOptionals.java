package JavaNangCao.JavaAdvancedLearn.Optionals;
import java.util.*;

public class BookOptionals {
    private List<Book> library = new ArrayList<>();

    public BookOptionals() {
        library.add(new Book("Clean Code", 360));
        library.add(new Book("Python", 140));
    }

    public Optional<Book> findBookByTitle(String title){
        return library.stream()
                    .filter(b -> b.getTitle().equalsIgnoreCase(title))
                    .findFirst();
    }
}
