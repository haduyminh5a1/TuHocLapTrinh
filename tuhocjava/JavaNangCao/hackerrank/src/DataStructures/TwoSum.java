package DataStructures;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class ResultTwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] check = new int[2];
        for (int i=0;i<nums.length-1;i++){
            for (int j=nums.length-1;j>i;j--){
                if (nums[i]+nums[j]==target){
                    check[0] =i;
                    check[1] =j;
                }
            }
        }
        return check;
    }
}
public class TwoSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = null;
        try{
            String input = bufferedReader.readLine();
            if (input == null || input.trim().isEmpty() ){
                return;
            }
            String[] stringNumbers = input.trim().split("\\s+");

            nums = new int[stringNumbers.length];
            for (int i=0;i<stringNumbers.length;i++){
                if (!stringNumbers[i].isEmpty())
                    nums[i] = Integer.parseInt(stringNumbers[i]);
            }
            int target = Integer.parseInt(bufferedReader.readLine().trim());
            int[] result = ResultTwoSum.twoSum(nums, target);
            System.out.println(Arrays.toString(result));
        } catch (IOException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }
    }
}
