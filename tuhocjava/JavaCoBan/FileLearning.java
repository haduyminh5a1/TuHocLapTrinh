import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileLearning {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the file name: ");
        String fileName = input.nextLine();
        File resultFile = new File(fileName);
        if (!resultFile.exists()){
            System.out.println("File not exist");
            return;
        }
        PrintWriter writer = new PrintWriter(resultFile);
        while (true){
            String line = input.nextLine();
            if (line.isEmpty()) break;
            writer.println(line);
        }
        writer.close();
    }
}
