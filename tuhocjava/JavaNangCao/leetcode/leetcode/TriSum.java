package JavaNangCao.leetcode.leetcode;

import java.util.*;

public class TriSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); //Khoi tao array list chua ket qua
        Arrays.sort(nums); //Sap xep cac phan tu trong list de giup loai bo cac phan tu trung + dung 2 con tro vao tim kiem 

        for (int i=0;i<nums.length-2;i++){ //Lap qua cac phan tu trong list nums den nums-2 vi can cho cho left va right
            if (i>0 && nums[i] == nums[i-1]){
                continue;
            } //Kiem tra neu phan tu tiep theo bi trung thi se bo qua (tac dung cua Arrays.sort(nums))

            int left = i+1; 
            int right = nums.length - 1; //Khoi tao 2 con tro left va right 

            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while(left < right && nums[left] == nums[left + 1]) left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if (sum<0){
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().trim().replace(" ", "");
        if (s.isEmpty()) return;
        
        String[] strs = s.split("\\s+");

        int[] nums = new int[strs.length];

        for (int i=0;i<strs.length;i++){
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(threeSum(nums));
    }
}
