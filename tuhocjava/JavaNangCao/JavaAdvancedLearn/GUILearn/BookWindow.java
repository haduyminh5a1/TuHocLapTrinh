package JavaNangCao.JavaAdvancedLearn.GUILearn;
import javax.swing.*;

public class BookWindow extends JFrame {
    private JPanel panel;
    private JLabel messageLabel;
    private JTextField bookTextField;
    private JButton addButton;

    private final int WINDOW_HEIGHT = 400;
    private final int WINDOW_WIDTH = 400;

    public BookWindow(){
        setTitle("Book Manager");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        buildPanel();
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void buildPanel(){
        messageLabel = new JLabel("Enter new book title");
        bookTextField = new JTextField(15);
        addButton = new JButton("Add to library");
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(bookTextField);
        panel.add(addButton);
    }
}
