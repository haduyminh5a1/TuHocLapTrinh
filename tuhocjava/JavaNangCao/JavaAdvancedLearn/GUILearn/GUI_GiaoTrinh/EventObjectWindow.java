package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;;

public class EventObjectWindow extends JFrame {
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JPanel panel;
    private final int WINDOW_WIDTH = 250;
    private final int WINDOW_HEIGHT = 350;

    public EventObjectWindow(){
        setTitle("Event Window Object");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setBackground(Color.PINK);

        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");

        button1.addActionListener(new ButtonListener());
        button2.addActionListener(new ButtonListener());
        button3.addActionListener(new ButtonListener());

        panel = new JPanel();
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

        add(panel);

        setVisible(true);
    }

    /**
     * The ButtonListener class handles the event when users click on it
     */
    private class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String actionCommand = e.getActionCommand();

            if (actionCommand.equals("Button 1")){
                JOptionPane.showMessageDialog(null, "You have just clicked button 1");
            }
            else if (actionCommand.equals("Button 2")){
                JOptionPane.showMessageDialog(null, "You have just clicked button 2");
            }
            else if (actionCommand.equals("Button 3")){
                JOptionPane.showMessageDialog(null, "You have just clicked button 3");
            }
        } 
    }
    public static void main(String[] args) {
        new EventObjectWindow();
    }
}
