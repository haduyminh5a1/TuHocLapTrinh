import java.util.*;
import java.io.*;
import javax.imageio.IIOException;
public class test37 {
        public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the input file: ");
        String inputFileName = input.nextLine();
        System.out.print("Enter the name of the output file: ");
        String outputFileName = input.nextLine();
        BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
        PrintWriter writer = new PrintWriter(new FileWriter(outputFileName));{
        String line;
        while ((line = reader.readLine()) != null) {
            writer.println(line.toUpperCase());
        }
        System.out.println("File has been converted to uppercase and saved as " + outputFileName);
    }
}
}
