package JavaNangCao.leetcode.leetcode;

public class MoveZeroes {
    public void moveZeroes(int[] nums){
        // int i=0;
        // int j=0;
        // while (i < nums.length){
        //     if (nums[i] == 0) {
        //         while (nums[j] == 0 && j < nums.length - 1){
        //             j++;
        //         }
        //     }
        //     while (j < nums.length && nums[j] == 0) {
        //         j++;
        //     }
        //     if (j < nums.length) {
        //         nums[i] = nums[j];
        //         nums[j] = 0;
        //     }
        //     else {
        //         break;
        //     }
        //     i++;
        // }

        int i=0;
        for (int j=0;j<nums.length;j++) {
            if (nums[j] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                i++;
            }
        }
    /*  int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        } */
    }
}
