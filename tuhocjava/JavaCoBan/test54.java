import java.util.Scanner;

public class test54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nhapVao = input.nextLine();
        if (!nhapVao.contains(" ")){
            System.out.println(nhapVao);
        }
        String trimmedString = nhapVao.trim();
        String[] words = trimmedString.split("\\s+");
        StringBuilder ketQua = new StringBuilder();
        for (int i=0;i<words.length;i++) {
            String word = words[i];
            if (word.isEmpty()){
                continue;
            }
            String lowerCase = word.toLowerCase();
            String upperCase = Character.toUpperCase(lowerCase.charAt(0)) + lowerCase.substring(1);
            ketQua.append(upperCase);
            if (i<words.length-1){
                ketQua.append(" ");
            }
        }
        String output = ketQua.toString();
        System.out.println(output);
    }
}
