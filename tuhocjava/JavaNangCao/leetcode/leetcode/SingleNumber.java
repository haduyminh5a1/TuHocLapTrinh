package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class SingleNumber {
    public static int singleNumber(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i : nums){
            if (!set.add(i)) {
                set.remove(i);
            }
        }
        for (int i : set) {
            return i;
        }
        return -1;
    }
    // public int singleNumber(int[] nums) {
    //     HashMap<Integer,Integer> map = new HashMap<>();
    //     for(int i : nums){
    //         map.put(i,map.getOrDefault(i,0)+1);
    //     }
    //     for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //         if(entry.getValue()==1){
    //             return entry.getKey();
    //         }
    //     }return -1;
    // }
}
