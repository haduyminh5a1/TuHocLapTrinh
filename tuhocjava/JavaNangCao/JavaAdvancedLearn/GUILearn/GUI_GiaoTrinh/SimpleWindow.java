package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import javax.swing.*;

public class SimpleWindow extends JFrame {
    /**
     * Constructor
     */
    public SimpleWindow(){
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 400;

        setTitle("Simple Window");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(rootPaneCheckingEnabled);
    }
    /**
     * Embedded main
     */
    public static void main(String[] args) {
        SimpleWindow window = new SimpleWindow();
        //Rut gon bang cach dung anonhymous class new SimpleWindow();
    }
}
