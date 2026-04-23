package JavaNangCao.JavaAdvancedLearn.GUILearn;
import javax.swing.*;


/**
 * 
 * @author haduyminh5a1
 */
public class HelloSwing {

    public static void main(String[] args) {
        JFrameLearn window = new JFrameLearn();
        BookWindow win = new BookWindow();
        SwingUtilities.invokeLater(() -> { 
            new BookWindow(); });
    }
}
