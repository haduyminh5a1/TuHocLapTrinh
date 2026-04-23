package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import javax.swing.*;
import java.awt.*;

public class FlowWindow extends JFrame {
    private final int WINDOW_WIDTH = 200;
    private final int WINDOW_HEIGHT = 150;

    public FlowWindow() {
        setTitle("Flow Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        add(button1);
        add(button2);
        add(button3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowWindow();
    }
}
