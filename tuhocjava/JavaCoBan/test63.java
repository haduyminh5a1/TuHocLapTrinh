import java.util.*;
import java.io.*;
public class test63 {
    public static void main(String[] args) {
        Random n = new Random();
        Scanner input = new Scanner(System.in);
        String nhapVao = input.nextLine();
        try(PrintWriter writer = new PrintWriter(new File(nhapVao))){
            File file = new File(nhapVao);
            if (file.createNewFile()){
                System.out.println("File moi da duoc tao");
            }
            else{
                System.out.println("File da co san");
            }
            for (int i=0;i<10;i++){
                int soNgauNhien = n.nextInt(1,1000);
                writer.println(soNgauNhien);
            }
        }
        catch (IOException exception) {
            System.err.println("Loi khi tao tep: " + exception.getMessage());
            exception.printStackTrace();
        }
        
    }
}
