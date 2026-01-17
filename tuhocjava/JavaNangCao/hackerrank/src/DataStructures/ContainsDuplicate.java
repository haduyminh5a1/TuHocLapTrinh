package DataStructures;
import java.io.*;
import java.util.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ResultConTainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-1;i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
public class ContainsDuplicate {
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
            boolean result = ResultConTainsDuplicate.containsDuplicate(nums);
            System.out.println(result);
        } catch (IOException | NumberFormatException ex){
            System.out.println(ex.getMessage());
        }

    }
}
