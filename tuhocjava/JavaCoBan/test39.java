import java.util.*;
import java.io.*;
public class test39 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int soLan = 0;
        System.out.print("Nhap vao ten file: ");
        String file = input.nextLine();
        System.out.print("Nhap vao ki tu can dem: ");
        char nhapVao = input.next().charAt(0);
        input.close();
        Scanner reader = new Scanner(new File(file));
        while (reader.hasNext()){
            String fileContent = reader.next();
            for (int i=0;i<fileContent.length();i++){
                if (nhapVao == fileContent.charAt(i)){
                    soLan++;
                }
            }
        }
        System.out.println(soLan);
        reader.close();
    }
}
