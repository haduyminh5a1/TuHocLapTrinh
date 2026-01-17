package LuyenThi;
import java.io.*;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Moi ban nhap ten duong dan den file nop bai: ");
        String fileName = input.nextLine();
        File resultFile = new File(fileName);
        if (!resultFile.exists()){
            if (resultFile.createNewFile()){
                System.out.println("File khong ton tai => Da tao file ket qua moi!");
            }
        }
        else {
            System.out.println("File ton tai => Ket qua se duoc luu vao file " + resultFile.getAbsolutePath());
        }

        System.out.println("Vui long nhap so hoc sinh ban can them vao danh sach: ");
        int n = input.nextInt();
        input.nextLine();
        Student1[] studList = new Student1[n];
        PrintWriter writer = new PrintWriter(resultFile);
        for (int i=0;i<n;i++){
            studList[i] = new Student1();
            System.out.println("Moi ban nhap vao danh sach sinh vien thu " + (i+1));
            System.out.println("Vui long nhap theo thu tu: Ma Sinh Vien, Ho Ten, Diem So");
            studList[i].setID(input.nextLine());
            studList[i].setName(input.nextLine());
            studList[i].setScore(input.nextDouble());
            input.nextLine();
        }
        writer.println("DANH SACH SINH VIEN");
        writer.println("--------------------------------------------------------------------------");
        writer.printf("%-15s | %-20s | %-7s | %-10s\n","Ma Sinh Vien", "Ho Ten", "Diem So", "Xep Hang");
        writer.println("--------------------------------------------------------------------------");
        for (int i=0;i<n;i++){
            writer.printf("%-15s | %-20s | %-7.2f | %-10s\n", 
                                studList[i].getID(), studList[i].getName(), studList[i].getScore(), studList[i].getRank());
        }
        writer.close();
        System.out.println("Dien du lieu vao file thanh cong\nThong tin duoc dien vao file:");
        System.out.println("DANH SACH SINH VIEN");
        System.out.println("-------------------------------------------------d-------------------------");
        System.out.printf("%-15s | %-20s | %-7s | %-10s\n","Ma Sinh Vien", "Ho Ten", "Diem So", "Xep Hang");
        System.out.println("--------------------------------------------------------------------------");
        for (int i=0;i<n;i++){
            System.out.printf("%-15s | %-20s | %-7.2f | %-10s\n", 
                                studList[i].getID(), studList[i].getName(), studList[i].getScore(), studList[i].getRank());
        }
        Scanner reader = new Scanner(resultFile);
        while (reader.hasNextLine()){
            String line = reader.nextLine();
            System.out.println(line);
        }
        reader.close();
    }
}
