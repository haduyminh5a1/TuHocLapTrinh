
import java.util.*;
import java.io.*;
public class test38 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        // Nhập tên tệp nguồn và tệp đích
        System.out.print("Nhap ten tep nguon (vi du: input.txt): ");
        String sourceFile = input.nextLine();

        System.out.print("Nhap ten tep dich (vi du: output.txt): ");
        String destFile = input.nextLine();

        // Mở tệp nguồn để đọc
        File fileIn = new File(sourceFile);
        if (!fileIn.exists()) {
            System.out.println("❌ Tep nguon khong ton tai!");
            return;
        }

        Scanner reader = new Scanner(fileIn);
        PrintWriter writer = new PrintWriter(destFile);

        // Đọc từng dòng, chuyển thành chữ hoa và ghi sang tệp đích
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            writer.println(line.toUpperCase());
        }

        // Đóng tệp
        reader.close();
        writer.close();
        input.close();
        System.out.println("✅ Da tao tep '" + destFile + "' voi toan bo chu in hoa.");        
    }
}
