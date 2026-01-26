import java.util.*;
public class MapLearn {
    
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        //put() get() size() isEmpty() | Entry : remove replace
        map.put("US", "Biden");
        map.put("Russia", "Putin");
        map.put("China", "Xi Pinjing");
        map.put("North Korea", "Kim Jong-un");

        System.out.println(map.get("US"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        for (Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        map.remove("US");
        map.replace("US", "Donald Trump");
        System.out.println(map.keySet());
        System.out.println(map.values());
        //Vidu
        Map<Character, Integer> map1 = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        for (int i=0;i<s.length();i++){
            if (map1.containsKey(s.charAt(i))){
                int freq = map1.get(s.charAt(i));
                ++freq;
                map1.put(s.charAt(i), freq);
            }
            else {
                map1.put(s.charAt(i), 1);
            }
        }
        for (Map.Entry<Character,Integer> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        //Vidu2
        Map<Integer, Integer> map2 = new HashMap<>();
        int n = input.nextInt();
        for (int i=0;i<n;i++){
            if (map2.containsKey(i)){
                int tanSuat = map2.get(i);
                ++tanSuat;
                map2.put(i, tanSuat);
            }
            else {
                map2.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
