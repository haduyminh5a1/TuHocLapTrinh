import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result_countResponseTimeRegressions {

    /*
     * Complete the 'countResponseTimeRegressions' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY responseTimes as parameter.
     */

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


public class CountResponseTimeRegressions {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int responseTimesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> responseTimes = IntStream.range(0, responseTimesCount).mapToObj(i -> {
                    try {
                        return bufferedReader.readLine().replaceAll("\\s+$", "");
                    } catch (IOException ex) {
                        throw new RuntimeException(ex);
                    }
                })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result_countResponseTimeRegressions.countResponseTimeRegressions(responseTimes);

        System.out.println(result);

        bufferedReader.close();
    }
}
