package Baitaptrenlop;
import java.util.*;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your file name: ");
        String fileName = input.nextLine();
        input.close();
        Scanner reader = new Scanner(new File(fileName));
        int wordCounter = 0;
        while (reader.hasNext()){
            String line = reader.next();
            String[] words = line.trim().split("\\s+");
            for (int i=0;i<words.length;i++){
                wordCounter++;
            }
        }
        System.out.println(wordCounter);
        reader.close();
        System.out.println(Character.valueOf('A') - '0');
    }
}
