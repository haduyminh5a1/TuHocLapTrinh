import java.util.Scanner;

public class test27{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S1 = scanner.nextInt();
        int S2 = scanner.nextInt();
        int S3 = scanner.nextInt();
        
     
        scanner.close();

        int minSum = 3;
       
        int maxSum = S3 + S2 + S1;


        int[] frequency = new int[maxSum + 1];

       
        for (int x1 = 1; x1 <= S1; x1++) {
          
            for (int x2 = 1; x2 <= S2; x2++) {
               
                for (int x3 = 1; x3 <= S3; x3++) {
                    int currentSum = x1 + x2 + x3;
                    
                    frequency[currentSum]++;
                }
            }
        }

     
        int maxFrequency = -1;
        int resultSum = -1; 


        for (int sum = minSum; sum <= maxSum; sum++) {
            int currentFrequency = frequency[sum];
            
            
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                resultSum = sum; 
            } 

        }

        System.out.println(resultSum);
    }
}
