package JavaNangCao.Baitaptrenlop.WrapperClass;

import javax.swing.JOptionPane;

public class CharacterTest {
    public static void main(String[] args) {
        String input;
        char ch;

        input = JOptionPane.showInputDialog("Enter any single character:");
        ch = input.charAt(0);

        if (Character.isLetter(ch)){
            JOptionPane.showMessageDialog(null, "That is a letter.");
        }

        System.exit(0);
    }
}
