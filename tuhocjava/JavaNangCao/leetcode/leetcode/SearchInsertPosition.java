package JavaNangCao.leetcode.leetcode;
import java.io.*;
import java.util.Arrays;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            if (nums[mid] == target){
                return mid;
            }
            else if (target > nums[mid]){
                low = mid + 1;
            }
            else if (target < nums[mid]){
                high = mid - 1;
            }
        }
        return low;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int[] nums = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();

        int target = Integer.parseInt(reader.readLine());
        
        int result = searchInsert(nums,target);
        System.out.println(result);
    }
}
