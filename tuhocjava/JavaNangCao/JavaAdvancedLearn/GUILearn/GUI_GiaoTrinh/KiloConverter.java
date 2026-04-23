package JavaNangCao.JavaAdvancedLearn.GUILearn.GUI_GiaoTrinh;
import javax.swing.*;

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

        //Create a JPanel object and let the panel field reference it
        panel = new JPanel();

        //Add the label, text field and button component to the panel
        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);
    }

    /**
     * main method
     */
    public static void main(String[] args) {
        new KiloConverter();
    }
}
