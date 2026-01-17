import java.util.*;
import java.io.*;
public class FileLearning1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the file name: ");
        String fileName = input.nextLine();
        File outputFile =  new File(fileName);
        if (!outputFile.exists()){
            System.out.println("File not found!");
            return;
        }
        System.out.println("Enter 1 character: ");

    }
}
