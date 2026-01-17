public class HanoiTower {
    public static void solve(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Đĩa 1: " + from + " -> " + to);
            return;
        }
        solve(n - 1, from, aux, to);
        System.out.println("Đĩa " + n + ": " + from + " -> " + to);
        solve(n - 1, aux, to, from);
    }

    public static void main(String[] args) {
        int n = 3; // Thử với 3 đĩa
        solve(n, 'A', 'C', 'B');
    }
}
