import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class oct0201countPressTime {
    private int count = 0;
    public oct0201countPressTime() {
        JFrame frame = new JFrame("Basic Counter");
        JButton button = new JButton("Count : 0");

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                count++;
                button.setText("Count : " + count);
        }
    });
    frame.setLayout(new FlowLayout());
    frame.add(button);
    frame.setSize(200,100);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    }
    public static void main(String[] args) {
        new oct0201countPressTime();
    }
}
