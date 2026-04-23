package JavaNangCao.JavaAdvancedLearn.GUILearn;
import javax.swing.*;
import java.awt.*;
    // Cách viết chuẩn: Kế thừa JFrame
public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Quản lý thư viện - HUCE");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Hiển thị giữa màn hình
        setVisible(true);

        // Thêm các thành phần
        initUI();
    }

    private void initUI() {
        // Sử dụng Layout Manager thay vì setBounds thủ công
        setLayout(new BorderLayout());
        add(new JButton("Click me"), BorderLayout.SOUTH);
    }
}

