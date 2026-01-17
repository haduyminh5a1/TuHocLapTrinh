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
class ResultHourGlassSum {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int n = arr.size();
        int currentSum = 0;
        int bestSum = Integer.MIN_VALUE;
        for (int i=0;i<n-2;i++){
            for (int j=1;j<n-1;j++){
                currentSum = arr.get(i).get(j - 1) + arr.get(i).get(j) + arr.get(i).get(j + 1) +
                        arr.get(i + 1).get(j) +
                        arr.get(i + 2).get(j - 1) + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1);
                if (currentSum>bestSum){
                    bestSum = currentSum;
                }
            }
        }
        return bestSum;
    }
}
public class HourGlassSum {
    public static void main(String[] args) {
            int N = 3; // Kích thước ma trận
            List<List<Integer>> matrix = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                System.out.println("Nhập ma trận " + N + "x" + N + " (mỗi hàng trên một dòng, cách nhau bằng khoảng trắng):");

                for (int i = 0; i < N; i++) {
                    String line = reader.readLine();
                    List<Integer> row = Stream.of(line.trim().split("\\s+"))
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
                    matrix.add(row);
                }

                System.out.println("Đã đọc ma trận: " + matrix);
            } catch (IOException | NumberFormatException e) {
                System.err.println("Lỗi: Lỗi định dạng đầu vào.");
            }
        }
}
