import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class oct0101RegistrationForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");
        f.setSize(400,350);
        f.setLocation(500,500);

        // JLabel titleLabel = new JLabel("Registration Form");
        // titleLabel.setBounds(700,20,250,50);
        // f.add(titleLabel);

        JLabel label1 = new JLabel("NAME :");
        label1.setBounds(30,20,150,30);
        f.add(label1);

        JTextField text1 = new JTextField();
        text1.setBounds(140,20,200,30);
        f.add(text1);

        JLabel label2 = new JLabel("EMAIL :");
        label2.setBounds(30,60,150,30);
        f.add(label2);

        JTextField text2 = new JTextField();
        text2.setBounds(140,60,200,30);
        f.add(text2);

        JLabel label3 = new JLabel("MOB :");
        label3.setBounds(30,100,150,30);
        f.add(label3);

        JTextField text3 = new JTextField();
        text3.setBounds(140,100,200,30);
        f.add(text3);

        JLabel label4 = new JLabel("Gender :");
        label4.setBounds(30,140,150,30);
        f.add(label4);

        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("FeMale");

        r1.setBounds(120,140,70,30);
        r2.setBounds(190,140,70,30);

        f.add(r1);
        f.add(r2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2); 

        JLabel label5 = new JLabel("Language :");
        label5.setBounds(30,180,150,30);
        f.add(label5);

        JCheckBox ch1 = new JCheckBox("Java");
        JCheckBox ch2 = new JCheckBox("Python");
        JCheckBox ch3 = new JCheckBox("Php");

        f.add(ch1);
        f.add(ch2);
        f.add(ch3);

        // ch1.setBounds(120,180,70,30);
        // ch1.setBounds(190,180,70,30);
        // ch1.setBounds(260,180,70,30);

        ch1.setBounds(120,181,70,30);
        ch2.setBounds(190,181,70,30);
        ch3.setBounds(260,181,70,30);

        JLabel label6 = new JLabel("Country :");
        label6.setBounds(30,220,150,30);
        f.add(label6);

        String[] options = {"India", "Australia", "China", "Pakistan"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        
        comboBox.setBounds(140,220,200,30);
        f.add(comboBox);

        JButton btn = new JButton("SUBMIT");
        btn.setBounds(140,260,85,20);
        f.add(btn);

        f.setLayout(null);
        f.setVisible(true);
    }
}
