package JavaNangCao.leetcode.leetcode;

import java.util.*;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums){
        // HashSet<Integer> set = new HashSet<>();
        // for (int i=0;i<nums.length;i++){
        //     set.add(nums[i]);
        // }
        // return set.size();
        if (nums.length == 0) return 0;

        int i = 0; // Pointer for the position of the last unique element
        
        for (int j = 1; j < nums.length; j++) {
            // If we find a new unique element
            if (nums[j] != nums[i]) {
                i++;           // Move the unique pointer forward
                nums[i] = nums[j]; // Update the next unique spot with the new value
            }
        }
        
        // Return count (index is 0-based, so count is i + 1)
        return i + 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] s = input.nextLine().trim().split("\\s+");
        int[] nums = new int[s.length];
        for (int i=0;i<s.length;i++){
            nums[i] = Integer.parseInt(s[i]);
        }
        System.out.println(removeDuplicates(nums));
    }
}
