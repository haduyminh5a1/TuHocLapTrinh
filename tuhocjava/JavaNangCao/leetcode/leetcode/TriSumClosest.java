package JavaNangCao.leetcode.leetcode;
import java.util.*;

public class TriSumClosest {
    public static int threeSumClosest(int[] nums, int target){
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int d = Integer.MAX_VALUE;
        for (int i=0;i<nums.length-2;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < d){
                    d = Math.abs(sum - target);
                    result = sum;
                }
                if (sum == target) return sum;
                else if (sum < target) {
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                }
                else {
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                }
            }
        }
        return result;
    }
}
