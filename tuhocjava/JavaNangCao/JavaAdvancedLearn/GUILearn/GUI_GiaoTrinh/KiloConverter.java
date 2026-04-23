package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The KiloConverter class displays a JFrame that lets users
 * enter a distance in kilometers. When the Calculate button
 * is click, a dialog box is displayed with the distance converted to miles.
 * @author haduyminh5a1
 */
public class KiloConverter extends JFrame {
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField kiloTextField;
    private JButton calcButton;
    private final int WINDOW_WIDTH = 350;
    private final int WINDOW_HEIGHT = 400;

    /**
     * Constructor
     */

    public KiloConverter(){
        setTitle("Kilo Converter");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        buildPanel();
        add(panel);


        setVisible(true);
    }

    /**
     * A buildPanel method adds a label, a text field and a button to a panel
     */

    public void buildPanel(){
        //Create a label to display instruction on the panel
        messageLabel = new JLabel("Enter a distance in kilometers:");
        //Create a text field 10 characters width
        kiloTextField = new JTextField(10);
        //Create a button with the caption "Calculate"
        calcButton = new JButton("Calculate");

        //Add an action to the Calculate button
        calcButton.addActionListener(new CalcButtonListener());

        //Create a JPanel object and let the panel field reference it
        panel = new JPanel();

        //Add the label, text field and button component to the panel
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }

    /** */
    private class CalcButtonListener implements ActionListener {

        /**
         * The actionPerformed method executes when the user
         * clicks on the Calculate button.
         * @param e The event object
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            final double CONVERSION = 0.614;
            String input;
            double miles;

            /*Get the text entered by user into the text field */
            input = kiloTextField.getText();

            Pattern pattern = Pattern.compile("\\d*");
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()){
                //Convert the kilometers input to miles
                miles = Double.parseDouble(input) * CONVERSION;
                JOptionPane.showMessageDialog(null, input + " kilometers is " + miles + " miles");
            }
            else {
                JOptionPane.showMessageDialog(null, "This is not a valid input");
            }
        }
        
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        new KiloConverter();
    }
}
