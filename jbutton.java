// import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class sep3001jbutton {
    public static void main(String[] args) {
        JFrame jf = new JFrame("The JFrame");
        jf.setSize(300, 300);
        // jf.setBackground(Color.GRAY);
        jf.setLocation(100,100);

        JButton btn = new JButton("Login");
        btn.setBounds(90, 90, 100, 40);
        jf.add(btn);

        jf.setLayout(null);
        jf.setVisible(true);
    }
}
