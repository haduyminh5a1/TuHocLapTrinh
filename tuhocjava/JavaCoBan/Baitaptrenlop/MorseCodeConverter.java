package Baitaptrenlop;
import java.util.*;

public class MorseCodeConverter {
    public static void main(String[] args) {
        HashMap<Character, String> morseMap = new HashMap<>();
        morseMap.put(' ', " ");
        morseMap.put(',', "--..--");
        morseMap.put('.', ".-.-.-");
        morseMap.put('?', "..--..");
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
        morseMap.put('A', ".-");    morseMap.put('B', "-...");  morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");   morseMap.put('E', ".");      morseMap.put('F', "..-.");
        morseMap.put('G', "--.");   morseMap.put('H', "....");   morseMap.put('I', "..");
        morseMap.put('J', ".---");  morseMap.put('K', "-.-");    morseMap.put('L', ".-..");
        morseMap.put('M', "--");    morseMap.put('N', "-.");     morseMap.put('O', "---");
        morseMap.put('P', ".--.");  morseMap.put('Q', "--.-");   morseMap.put('R', ".-.");
        morseMap.put('S', "...");   morseMap.put('T', "-");      morseMap.put('U', "..-");
        morseMap.put('V', "...-");  morseMap.put('W', ".--");    morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");  morseMap.put('Z', "--..");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = scanner.nextLine().toUpperCase();
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (morseMap.containsKey(c)) {
                output.append(morseMap.get(c)).append(" ");
            } else {
                output.append("[?] ");
            }
        }
        System.out.println("Morse code:");
        System.out.println(output.toString().trim());
    }
}

