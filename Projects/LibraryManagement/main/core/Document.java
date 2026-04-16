package Projects.LibraryManagement.main.core;
import java.io.*;

public abstract class Document implements Serializable {
    protected String id;
    protected String title;
    public Document(String id, String title) {
        this.id = id;
        this.title = title;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public abstract double calculateLateFee(int days);
}

