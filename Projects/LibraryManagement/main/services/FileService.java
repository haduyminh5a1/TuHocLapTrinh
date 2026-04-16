package Projects.LibraryManagement.main.services;

import java.io.*;
import java.util.*;

import Projects.LibraryManagement.main.core.Document;

public class FileService {
    private static final String FILE_PATH = "data/library.dat";

    public static void saveDocument(List<Document> documents){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH))) {
            oos.writeObject(new ArrayList<>(documents));
            System.out.println("Lưu dữ liệu thành công!");
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }

    public static List<Document> loadDocuments() {
        File file = new File(FILE_PATH);
        
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (List<Document>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Lỗi khi đọc file hoặc file bị hỏng: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
