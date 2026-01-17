
import java.util.*;

public class test60 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(List.of(1,9,3,14,5,27,8));
        ArrayList<Integer> list1;
        list1 = (ArrayList<Integer>) list.clone();
        Collections.sort(list1);
        list1.remove(0);
        list1.remove(list1.size()-1);
        System.out.println(list1);
        int lon2 = list1.get(0);
        int be2 = list1.get(list1.size()-1);
        System.out.println(lon2 + " " + be2);
        System.out.println("Vi tri index tuong ung: " + list.indexOf(lon2) + " " +  list.indexOf(be2));
    }
}
