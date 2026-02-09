import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class VectorGreedyOptimized {

    // Hàm xử lý chính: Thực hiện chiến thuật tham lam
    public static int[] solve(int n, long[][] vectors) {
        int[] choices = new int[n];
        long currentX = 0;
        long currentY = 0;

        for (int i = 0; i < n; i++) {
            long xi = vectors[i][0];
            long yi = vectors[i][1];

            // Tính bình phương độ dài khi cộng (+)
            // (currentX + xi)^2 + (currentY + yi)^2
            long distSqPlus = (currentX + xi) * (currentX + xi) + (currentY + yi) * (currentY + yi);

            // Tính bình phương độ dài khi trừ (-)
            // (currentX - xi)^2 + (currentY - yi)^2
            long distSqMinus = (currentX - xi) * (currentX - xi) + (currentY - yi) * (currentY - yi);

            // Tham lam: Chọn hướng nào có bình phương độ dài nhỏ hơn
            if (distSqPlus <= distSqMinus) {
                currentX += xi;
                currentY += yi;
                choices[i] = 1;
            } else {
                currentX -= xi;
                currentY -= yi;
                choices[i] = 2;
            }
        }
        return choices;
    }

    public static void main(String[] args) throws IOException {
        // Sử dụng BufferedReader để đọc dữ liệu tốc độ cao
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        if (!st.hasMoreTokens()) return;
        int n = Integer.parseInt(st.nextToken());
        long l = Long.parseLong(st.nextToken()); // L không dùng trực tiếp trong tham lam nhưng có trong input

        long[][] vectors = new long[n][2];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            vectors[i][0] = Long.parseLong(st.nextToken());
            vectors[i][1] = Long.parseLong(st.nextToken());
        }

        // Gọi hàm giải bài toán
        int[] results = solve(n, vectors);

        // In kết quả
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(results[i]).append(i == n - 1 ? "" : " ");
        }
        System.out.println(sb.toString());
    }
}