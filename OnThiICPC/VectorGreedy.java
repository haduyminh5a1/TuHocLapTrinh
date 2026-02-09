import java.io.*;
import java.util.*;

public class VectorGreedy {
    static class Vector {
        int id; long x, y;
        Vector(int id, long x, long y) { this.id = id; this.x = x; this.y = y; }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long l = Long.parseLong(st.nextToken());

        Vector[] vs = new Vector[n];
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            vs[i] = new Vector(i, Long.parseLong(st.nextToken()), Long.parseLong(st.nextToken()));
        }

        int[] res = new int[n];
        Random rd = new Random();
        while (true) {
            for (int i = n - 1; i > 0; i--) {
                int j = rd.nextInt(i + 1);
                Vector tmp = vs[i]; vs[i] = vs[j]; vs[j] = tmp;
            }
            long curX = 0, curY = 0;
            for (int i = 0; i < n; i++) {
                long d1 = (curX + vs[i].x) * (curX + vs[i].x) + (curY + vs[i].y) * (curY + vs[i].y);
                long d2 = (curX - vs[i].x) * (curX - vs[i].x) + (curY - vs[i].y) * (curY - vs[i].y);
                if (d1 <= d2) {
                    curX += vs[i].x; curY += vs[i].y; res[vs[i].id] = 1;
                } else {
                    curX -= vs[i].x; curY -= vs[i].y; res[vs[i].id] = 2;
                }
            }
            if (curX * curX + curY * curY <= 2 * l * l) break;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(res[i]).append(i == n - 1 ? "" : " ");
        System.out.println(sb.toString());
    }
}