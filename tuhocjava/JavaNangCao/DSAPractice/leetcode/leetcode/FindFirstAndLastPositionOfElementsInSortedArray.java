package JavaNangCao.DSAPractice.leetcode.leetcode;

public class FindFirstAndLastPositionOfElementsInSortedArray {
    public static int[] searchRange(int[] nums, int target){
        int first = findFirstGreaterOrEqual(nums, target);

        if (first == nums.length || nums[first] != target){
            return new int[]{-1, -1};
        }

        int last = findFirstGreaterOrEqual(nums, target + 1) - 1;
        
        return new int[]{first, last};
    }

    public static int findFirstGreaterOrEqual(int[] nums, int k){
        int left = 0;
        int right = nums.length;
        while (left < right){
            int mid = left + (right - left)/2;
            if (nums[mid] < k){
               left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        return left;
    }
}
