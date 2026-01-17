import java.util.*;
public class test59 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int dem = 0;
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>(n);
        ArrayList<Integer> index = new ArrayList<>();
        for (int i=0;i<n;i++){
            int t = random.nextInt(1,101);
            list.add(t);
            if (t<80){
                dem++;
                index.add(i);
            }
        }
        System.out.println("Co " + dem + " gia tri be hon 80 trong list.");
        System.out.println("Vi tri cua chung tuong ung la: " + index);
    }
}
