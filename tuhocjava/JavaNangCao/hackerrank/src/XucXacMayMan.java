import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class XucXacMayMan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s1 = input.nextInt();
        int s2 = input.nextInt();
        int s3 = input.nextInt();

        int smallestsumValue = 0;
        int minSum = 1;
        int maxSum = s1+s2+s3;
        int[] sumFrequency = new int[maxSum+1];

        for (int i=1;i<=s1;i++){
            for (int j=1;j<=s2;j++){
                for (int k=1;k<=s3;k++){
                    int sum = i+j+k;
                    sumFrequency[sum]++;
                }
            }
        }
        int maxFrequency=0;
        for (int frequency : sumFrequency) {
            if (frequency>maxFrequency)
                maxFrequency = frequency;
        }
        int bestSum = 0;
        for (int sum = 0; sum <= maxSum; sum++) {
            if (sumFrequency[sum] == maxFrequency) {
                bestSum = sum;
                break;
            }
        }

        System.out.println(bestSum);
    }
}
