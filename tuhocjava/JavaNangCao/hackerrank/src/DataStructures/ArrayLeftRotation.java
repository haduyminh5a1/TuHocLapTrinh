package DataStructures;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class ResultArrayLeftRotation{
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int n = arr.size();
        for (int i=n;i>n-d;i--){
            arr.add(arr.get(0));
            arr.remove(0);
        }
        return arr;
        /*  int n = a.size();
            if (n == 0) return a;

            // Tính số lần xoay hiệu quả
            int dEffective = d % n;

            // Nếu d=0 hoặc d=N, không cần xoay
            if (dEffective == 0) return a;

            // Tạo danh sách mới để lưu kết quả
            List<Integer> result = new ArrayList<>(n);

            // 1. Thêm phần từ dEffective đến cuối (Phần sau của mảng)
            for (int i = dEffective; i < n; i++) {
                result.add(a.get(i));
            }

            // 2. Thêm phần từ 0 đến dEffective - 1 (Phần đầu của mảng, được chuyển về cuối)
            for (int i = 0; i < dEffective; i++) {
                result.add(a.get(i));
            }

            return result;
            */
    }
}
public class ArrayLeftRotation {
    public static void main(String[] args) {

        // Khai báo các biến cần thiết
        int N = 0; // Kích thước mảng
        int D = 0; // Số lần xoay
        List<Integer> arr = null; // Mảng đầu vào

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            // --- 1. Đọc N (kích thước) và D (số lần xoay) ---
            System.out.println("Nhập N và D (cách nhau bằng khoảng trắng, VD: 5 4):");
            String[] firstLine = bufferedReader.readLine().trim().split("\\s+");

            // Kiểm tra và gán giá trị
            if (firstLine.length >= 2) {
                N = Integer.parseInt(firstLine[0]);
                D = Integer.parseInt(firstLine[1]);
            } else {
                throw new IllegalArgumentException("Đầu vào Dòng 1 không hợp lệ.");
            }

            // --- 2. Đọc Mảng arr ---
            System.out.println("Nhập " + N + " phần tử mảng (cách nhau bằng khoảng trắng, VD: 1 2 3 4 5):");
            String secondLine = bufferedReader.readLine();

            // Sử dụng Stream để chuyển đổi chuỗi thành List<Integer>
            arr = Stream.of(secondLine.replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            // --- Kiểm tra đầu vào đã đọc ---
            System.out.println("\n--- Đầu vào đã đọc thành công ---");
            System.out.println("Kích thước N: " + N);
            System.out.println("Số lần xoay D: " + D);
            System.out.println("Mảng arr: " + arr);

            // --- Ở đây bạn sẽ gọi hàm giải quyết bài toán xoay mảng ---
            // List<Integer> rotatedArr = rotateLeft(arr, D);
            // System.out.println("Mảng sau khi xoay: " + rotatedArr);

        } catch (IOException e) {
            System.err.println("Lỗi I/O khi đọc đầu vào: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Lỗi định dạng số: Vui lòng đảm bảo bạn nhập số nguyên.");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
