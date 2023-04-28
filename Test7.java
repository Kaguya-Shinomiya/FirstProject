package A;

import java.awt.*;
import javax.swing.*;

public class Test7 extends JFrame{

    private ImageIcon imageIcon;
    private JLabel label;

    public Test7() {
        // Tạo ImageIcon từ tệp hình ảnh trong thư mục của bạn
        imageIcon = new ImageIcon("D:\\HTML\\Book\\Hinhanh\\It-turns-out-that-I-have-a-fiancee-but-she-is-the-famous-villainess-of-the-school-What-should-I-do.jpg");

        // Thay đổi kích thước của ảnh với tỷ lệ 50%
        Image image = imageIcon.getImage().getScaledInstance(imageIcon.getIconWidth()/2, imageIcon.getIconHeight()/2, Image.SCALE_SMOOTH);

        // Tạo ImageIcon mới từ ảnh đã được thay đổi kích thước
        ImageIcon scaledImageIcon = new ImageIcon(image);
        // Tạo JLabel và đặt hình ảnh vào đó
        label = new JLabel();
        label.setIcon(scaledImageIcon);

        // Đặt thuộc tính layout cho JFrame
        setLayout(new FlowLayout());

        // Thêm JLabel vào JFrame
        add(label);

        // Thiết lập kích thước JFrame và hiển thị nó
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // Tạo một đối tượng ImageExample và hiển thị nó
        new Test7();
    }


    
}
