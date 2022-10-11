

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(0, 255, 255));
        getContentPane().setLayout(null);

        JLabel heading = new JLabel(" Pleasese read Instructions");
        heading.setBounds(171, 25, 457, 30);
        heading.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
        heading.setForeground(new Color(0, 0, 128));
        getContentPane().add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
                "<html>"+
                        "1. If have choice of 4 subject" + "<br><br>" +
                        "2. Each subject has 4 option" + "<br><br>" +
                        "3. Each mcqs has 10 marks" + "<br><br>" +
                        "4. You have 15 second for each question" + "<br><br>" +
                        "5. Only a fool asks and a wise answers (Be wise, not otherwise)" + "<br><br>" +
                        "6. Do not get nervous if your friend is answering more questions, may be he/she is doing Jai Mata Di" + "<br><br>" +
                        "7. Brace yourself, this paper is not for the faint hearted" + "<br><br>" +
                        "8. May you know more than what Bill Gates knows, Good Luck" + "<br><br>" +
                        "<html>"
        );
        getContentPane().add(rules);

        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(0, 0, 128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        getContentPane().add(back);

        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(0, 0, 128));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        getContentPane().add(start);

        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Option();
        } else {
            setVisible(false);
            new Login();
        }
    }

    public static void main(String[] args) {
        new Rules("User");
    }
}
