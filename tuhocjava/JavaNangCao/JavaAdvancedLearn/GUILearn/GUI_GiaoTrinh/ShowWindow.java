package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import javax.swing.*;

public class ShowWindow {
    public static void main(String[] args) {
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 400;

        JFrame window = new JFrame();

        window.setTitle("A Simple Window");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // DO_NOTHING_ON_CLOSE DISPOSE_ON_CLOSE HIDE_ON_CLOSE
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}
