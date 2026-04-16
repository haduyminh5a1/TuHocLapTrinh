package Projects.LibraryManagement.main.models;

import Projects.LibraryManagement.main.core.Document;

public class Magazine extends Document {
    private int issues;

    public Magazine(String id, String title, int issues) {
        super(id, title);
        this.issues = issues;
    }

    public double calculateLateFee(int days){
        return days * 10000;
    }
}
