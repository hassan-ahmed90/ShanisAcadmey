
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules1, back;
    JTextField tfname;
    JTextArea textArea = new JTextArea();


    Login() {
        getContentPane().setBackground(new Color(0, 255, 255));
        getContentPane().setLayout(null);

      //  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));

        JLabel heading = new JLabel("Shani's Academy");
        heading.setBounds(181, 46, 425, 58);
        heading.setFont(new Font("Verdana", Font.BOLD, 40));
        heading.setForeground(new Color(0, 0, 128));
        getContentPane().add(heading);

        JLabel name = new JLabel("Name");
        name.setBounds(202, 169, 103, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(0, 0, 128));
        getContentPane().add(name);

        tfname = new JTextField();
        tfname.setBounds(354, 165, 230, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        getContentPane().add(tfname);

        rules1 = new JButton("NEXT");
        rules1.setBounds(429, 363, 120, 45);
        rules1.setBackground(new Color(0, 0, 128));
        rules1.setForeground(Color.WHITE);
        rules1.addActionListener(this);
        getContentPane().add(rules1);

        back = new JButton("CLOSE");
        back.setBounds(168, 363, 120, 45);
        back.setBackground(new Color(0, 0, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        getContentPane().add(back);

        JLabel lblNewLabel = new JLabel("Seat No");
        lblNewLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        lblNewLabel.setForeground(new Color(0, 0, 128));
        lblNewLabel.setBounds(196, 248, 114, 20);
        getContentPane().add(lblNewLabel);


        textArea.setFont(new Font("Times New Roman", Font.BOLD, 18));
        textArea.setBounds(354, 245, 231, 22);
        getContentPane().add(textArea);

        setSize(796, 522);
        setLocation(200, 150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules1) {
            String name = tfname.getText();
            String roll=textArea.getText();

            setVisible(false);
            Thread1 t = new Thread1();
            t.start();


        } else if (ae.getSource() == back) {
            setVisible(false);

        }
    }

    public static void main(String[] args) {
        new Login();

    }
}
