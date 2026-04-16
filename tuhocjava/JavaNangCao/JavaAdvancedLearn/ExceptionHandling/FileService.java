package JavaNangCao.JavaAdvancedLearn.ExceptionHandling;
import java.io.*;

public class FileService {
    private static final long MAX_SIZE = 5 * 1024 * 1024;

    public void uploadFile(String filePath) throws FileTooLargeException {
        File file = new File(filePath);

        if (file.exists() && file.length() > MAX_SIZE){
            throw new FileTooLargeException("Can't upload file", file.length(), MAX_SIZE);
        }

        System.out.println("Dang xu ly file: " + file.getName());
    }
}
