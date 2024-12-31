import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// import javax.swing.JButton;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JOptionPane;
// import javax.swing.JTextField;

import javax.swing.*; 

public class oct0202simpleSubmittedForm {
    public oct0202simpleSubmittedForm(){
        JFrame frame = new JFrame("Simple Form");
        frame.setLayout(new GridLayout(3,2));

        JLabel nameLabel = new JLabel("Name : ");
        JTextField nameField = new JTextField();

        JLabel emailLabel = new JLabel("Email : ");
        JTextField emailField = new JTextField();

        JButton submitButton = new JButton("Submit");

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = nameField.getText();
                String email = emailField.getText();
                JOptionPane.showMessageDialog(frame, "Submitted : \nName : " + name + "\n" + email);
            }
        });
        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(submitButton);
        frame.setSize(300,150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new oct0202simpleSubmittedForm();
    }
}
