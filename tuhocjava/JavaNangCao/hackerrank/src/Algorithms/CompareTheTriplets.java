package Algorithms;

import static java.util.stream.Collectors.toList;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b){
        List<Integer> score = new ArrayList<>();
        int aliceScore = 0;
        int bobScore = 0;
        for (int i=0;i<a.size();i++){
            if (a.get(i) > b.get(i)){
                aliceScore++;
            }
            else if (a.get(i) < b.get(i)){
                bobScore++;
            }
        }
        return Arrays.asList(aliceScore, bobScore);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> a = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        List<Integer> b = Stream.of(reader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        System.out.println(compareTriplets(a, b));
    }
}
