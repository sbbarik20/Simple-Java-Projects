import javax.swing.*;
import java.awt.event.*;

public class oct0102repeatedBoxesFromButton extends JFrame implements ActionListener{
    JButton btn;
    @Override
    public void actionPerformed(ActionEvent e){
        JDialog d = new JDialog();
        d.setSize(100,100);
        d.setLocation(100,100);
        d.setVisible(true);
    }
    oct0102repeatedBoxesFromButton(){
        this.setSize(300,300);
        this.setLocation(100,100);

        btn = new JButton("Login");
        btn.addActionListener(this);    //Register
        btn.setBounds(50,150,70,30);
        this.add(btn);

        this.setLayout(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new oct0102repeatedBoxesFromButton();
    }
}