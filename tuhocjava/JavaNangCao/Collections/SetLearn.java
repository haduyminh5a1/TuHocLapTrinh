
import java.util.*;
public class SetLearn {
    // add size contain remove addAll removeAll retainAll
    // HashSet LinkedHashSet
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(1);
        // set.add(4);
        // set.add(4);
        // //
        // System.out.println(set.size());
        // //
        // for (int x : set){
        //     System.out.print(x);
        // }
        // System.out.println();
        // Iterator it = set.iterator();
        // while (it.hasNext()){
        //     System.out.println(it.next() + " ");
        // }
        // //
        // if (set.contains(4)){
        //     System.out.println(true);
        // }
        // else
        //     System.out.println(false);
        // set.remove(4);
        // //
        // ArrayList<Integer> arr = new ArrayList<>();
        // for (int i=0;i<10;i++){
        //     arr.add(i);
        // }
        // set.addAll(arr);


        // LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // for (int i=0;i<n;i++){
        //     set.add(input.nextInt());
        // }

        // TreeSet: set.first set.last lower higher ceiling floor pollLast pollFirst headSet tailSet
        TreeSet<Integer> set = new TreeSet<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            set.add(input.nextInt());
        }
        TreeSet<String> set2 = new TreeSet<>();
        String s = input.nextLine();
        String[] arr = s.split("\\s+");
        for (String x : arr){
            set2.add(x);
        }
        input.close();
    }  
}
