import  java.util.*;
public class BinarySearch {
    //    public static int binarySearch(List<Integer> nums, int target) {
//        // Write your code here
//        ArrayList<Integer> index = new ArrayList<>();
//        for (int n : nums){
//            if (target == n){
//                return nums.indexOf(n);
//            }
//        }
//        return -1;
//    }
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        ArrayList<Integer> list = new ArrayList<>(n);
//        for (int i=0;i<n;i++){
//            int value = input.nextInt();
//            list.add(value);
//        }
//        int target = input.nextInt();
//        Collections.sort(list);
//        System.out.println(binarySearch(list, target));
//    }
    public static int binarySearch(List<Integer> list, int target) {
        int left = 0;
        int right = list.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = list.get(mid);

            if (value == target) {
                return mid;
            } else if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // không tìm thấy
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử
        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        // Nhập từng phần tử (không cần sắp xếp)
        System.out.println("Nhap cac phan tu (thu tu bat ky):");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Tự động sắp xếp List
        Collections.sort(list);
        System.out.println("List sau khi sap xep: " + list);

        // Nhập target
        System.out.print("Nhap target: ");
        int target = sc.nextInt();

        // Gọi binary search
        int index = binarySearch(list, target);

        System.out.println("Ket qua: " + index);
    }
}