package Algorithms;
import java.util.*;
import java.util.stream.Stream;
import java.io.*;
import static java.util.stream.Collectors.toList;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar){
        int sum = 0;
        for (int i : ar){
           sum += i; 
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> ar = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        System.out.println(simpleArraySum(ar));
    }
}
