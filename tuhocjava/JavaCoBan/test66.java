import java.util.*;

public class test66 {
    
    public static int countResponseTimeRegressions(List<Integer> responseTimes) {
    // Write your code here
        long sum=0L;
        int cout=0;
        for (int i=0;i<responseTimes.size();i++){
            int value = responseTimes.get(i); 
            if (i>0){
                double average = sum/i;
                if (value>average){
                    cout++;
                }
            }
            sum+=value;
        }
        return cout;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<Integer> responseTimes = new ArrayList<>(n);
        for (int i=0;i<n;i++){
            int value = input.nextInt();
            responseTimes.add(value);
        }
        System.out.println(countResponseTimeRegressions(responseTimes));
    }
}
