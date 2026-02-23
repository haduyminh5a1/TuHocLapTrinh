package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0;i<nums.length;i++) {
            int range = target - nums[i];

            if (map.containsKey(range)) {
                return new int[]{map.get(range), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
