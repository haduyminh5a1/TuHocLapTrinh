import java.util.*;
public class test61 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");
        String value = map.get(1);
        System.out.println(value);
        map.remove(2);
        String value1 = map.get(2);
        System.out.println(value1);
        boolean check = map.containsKey(2);
        System.out.println(check);
        boolean checkValue = map.containsValue("Mango");
        System.out.println(checkValue);
        boolean empty = map.isEmpty();
        System.out.println(empty);
        int soPt = map.size();
        System.out.println(soPt);
        for (Integer key : map.keySet()){
            String value2 = map.get(key);
            System.out.println(key + " : " + value2);
        }
    }
}
