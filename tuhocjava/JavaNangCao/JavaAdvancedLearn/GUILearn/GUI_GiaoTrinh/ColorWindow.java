package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;;

/**
 * This class demonstrates how to set the background color of 
 * a panel and the foreground color of a panel
 */

public class ColorWindow extends JFrame{
    private JLabel messageLabel;
    private JButton redButton;
    private JButton blueButton;
    private JButton yellowButton;
    private JPanel panel;
    private final int WINDOW_WIDTH = 200;
    private final int WINDOW_HEIGHT = 150;

    /**
     * Constructor
     */

    public ColorWindow() {
        setTitle("Colors");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        messageLabel = new JLabel("Click a button to select a color");

        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        yellowButton = new JButton("Green");

        redButton.addActionListener(new RedButtonListener());
        blueButton.addActionListener(new BlueButtonListener());
        yellowButton.addActionListener(new GreenButtonListener());

        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(redButton);
        panel.add(blueButton);
        panel.add(yellowButton);

        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Private inner class that handles the event when
     * the users clicks the Blue button
     */

    private class RedButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.RED);
            messageLabel.setBackground(Color.BLUE);
        }
    }

    /**
     * Private inner class that handles the event when
     * the users clicks the Blue button.
     */

    private class BlueButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.BLUE);
            messageLabel.setForeground(Color.YELLOW);
        }
    }

    /**
     * Private inner class that handles the event when
     * the user clicks the Green button
     */

    private class GreenButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            panel.setBackground(Color.GREEN);
            messageLabel.setForeground(Color.BLACK);
        }
    }

    public static void main(String[] args) {
        new ColorWindow();
    }
}
