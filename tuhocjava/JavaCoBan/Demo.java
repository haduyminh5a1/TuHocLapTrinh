import java.util.*;
import java.io.*;
public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Moi ban nhap ten (hoac duong dan) file luu ket qua: ");
        String fileName = input.nextLine();

        File resultFile = new File(fileName);

        if (!resultFile.exists()){
            if (resultFile.createNewFile()) {
                System.out.println("Da tao file moi: " + resultFile.getName());
            }
        } else {
            System.out.println("File " + fileName + " da ton tai. Du lieu se duoc ghi de vao file nay");
        }

        System.out.println("Moi ban nhap so sinh vien can nhap vao danh sach");
        int n = input.nextInt();
        input.nextLine();
        Student[] studList = new Student[n];
        for (int i=0;i<n;i++){
            studList[i] = new Student();
            System.out.println("Moi nhap theo trinh tu: ID sinh vien," 
                                            + " Ten sinh vien, Diem so: ");
            studList[i].setID(input.nextLine());
            studList[i].setName(input.nextLine());
            studList[i].setScore(input.nextFloat());
            input.nextLine();
        }
/*      System.out.println("Danh sach sinh vien: ");
        System.out.printf("%-10s | %-20s | %-7s | %-10s\n", 
                    "MaSV", "Ten", "Diem", "Xep hang");
        System.out.println("---------------------------------------------------------------");
        for (int i=0;i<n;i++){
            System.out.println("Nhap vao danh sach sinh vien thu " + (i+1));
            System.out.printf("%-10s | %-20s | %-7.2f | %-10s\n", 
                            studList[i].getID(), studList[i].getName(), studList[i].getScore(), studList[i].getRank());
            System.out.println();
        }
        System.out.println("Nhap ten sinh vien ban muon kiem tra diem");
        String name = input.nextLine();
        System.out.printf("%.2f" ,searchByName(studList, name, n));
        input.close();
    }
        */
    //Bắt đầu đọc ghi file
        
        PrintWriter printWriter = new PrintWriter(resultFile);
        printWriter.printf("%-10s | %-20s | %-7s | %-10s\n", 
                    "MaSV", "Ten", "Diem", "Xep hang");
        printWriter.println("---------------------------------------------------------------");
        for (int i=0;i<n;i++){
            printWriter.printf("%-10s | %-20s | %-7.2f | %-10s\n", 
                            studList[i].getID(), studList[i].getName(), studList[i].getScore(), studList[i].getRank());
        }
        printWriter.close();
        System.out.println("Da luu du lieu thanh cong tai " + resultFile.getAbsolutePath());
        System.out.println("Noi dung trong file " + fileName + ":");
        Scanner fileScanner = new Scanner(resultFile);
        while (fileScanner.hasNextLine()){
            System.out.println(fileScanner.nextLine());
        }
        fileScanner.close();
        input.close();
    }
    public static String findMax(Student[] studList, int listSize){
        float maxScore = studList[0].getScore();
        String name = studList[0].getName();
        for (int i=0;i<listSize;i++){
            if (studList[i].getScore()>maxScore){
                maxScore = studList[i].getScore();
                name = studList[i].getName();
            }
        }
        return name;
    }
    public static float searchByName(Student[] studList, String name, int listSize){
        for (int i=0;i<listSize;i++){
            if (name.equalsIgnoreCase(studList[i].getName())){
                return studList[i].getScore();
            }
        }
        return -1;
    }
}
