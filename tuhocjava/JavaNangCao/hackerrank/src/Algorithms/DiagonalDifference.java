package Algorithms;
import java.util.*;


public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr){
        int n = arr.size();
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0;i<n;i++){
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(n-1-i);
        }
        return (int) Math.abs(sum1 - sum2);
    }
}
