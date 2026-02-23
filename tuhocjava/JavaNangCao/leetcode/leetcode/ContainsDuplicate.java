package JavaNangCao.leetcode.leetcode;

import java.util.*;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> contained = new HashSet<>();
        for (int x : nums){
            if (contained.contains(x)){
                return true;
            }
            contained.add(x);
        }
        return false;
    }
}
