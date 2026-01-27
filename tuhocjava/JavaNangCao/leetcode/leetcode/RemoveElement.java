package JavaNangCao.leetcode.leetcode;
import java.io.*;

public class RemoveElement {
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split("[\\s,]+");
        int[] nums = new int[parts.length];
        for (int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        int val = Integer.parseInt(reader.readLine());
        int k = removeElement(nums, val);
        
        for (int i=0;i<nums.length;i++){
            System.out.println(nums[i] + " ");
        }
    }
}
