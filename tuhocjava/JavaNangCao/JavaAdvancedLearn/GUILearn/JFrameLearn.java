package JavaNangCao.JavaAdvancedLearn.GUILearn;

import javax.swing.*;

public class JFrameLearn extends JFrame{
    public JFrameLearn(){
        final int WINDOW_WIDTH = 400;
        final int WINDOW_HEIGHT = 400;

        setTitle("JFrame Learn");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
