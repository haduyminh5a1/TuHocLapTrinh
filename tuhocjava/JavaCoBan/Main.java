public class Main {
    public static void main(String[] args) {
        int n = 5;
        long result = factorial(n);
        System.out.println(n + "! = " + result);
    }

    /**
     * Hàm tính giai thừa bằng đệ quy
     * Công thức: n! = n * (n-1)!
     * Điều kiện dừng: 0! = 1
     */
    public static long factorial(int n) {
        // 1. Trường hợp cơ sở (Base case)
        if (n <= 1) {
            return 1;
        }
        // 2. Bước đệ quy (Recursive step)
        return n * factorial(n - 1);
    }
}
