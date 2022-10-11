import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Chemistry extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    String name;
    Chemistry(String name) {

        this.name = name;
        setBounds(50, 0, 1481, 697);
        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

       // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));

        qno = new JLabel();
        qno.setBounds(69, 142, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);

        question = new JLabel();
        question.setBounds(139, 142, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);

        questions[0][0] = "The soul of chemistry is dealing with ?";
        questions[0][1] = "Composition and properties of matter";
        questions[0][2] = "Internal structural changes in matter";
        questions[0][3] = " Composition of matter";
        questions[0][4] = "Properties of matter";

        questions[1][0] = "The radioactive isotope of hydrogen is called_?";
        questions[1][1] = "tritium";
        questions[1][2] = "Protium";
        questions[1][3] = "dueterium";
        questions[1][4] = "None of these";

        questions[2][0] = "Electron was discovered by?";
        questions[2][1] = "Michael Faraday";
        questions[2][2] = "James Maxwell";
        questions[2][3] = "Shani";
        questions[2][4] = "JJ Thomson";

        questions[3][0] = "Which of the following is a substance?";
        questions[3][1] = "Sea water";
        questions[3][2] = "Brass";
        questions[3][3] = "Graphite";
        questions[3][4] = "Trape water";

        questions[4][0] = "All of the following substances are crystalline except?";
        questions[4][1] = "Plastic";
        questions[4][2] = "Ice";
        questions[4][3] = "Sucros";
        questions[4][4] = "Diomand";

        questions[5][0] = "What is a mixture of Potassium Nitrate Powdered Charcoal and Sulphur called?";
        questions[5][1] = "Paint";
        questions[5][2] = "Gun water";
        questions[5][3] = "Cement";
        questions[5][4] = "Glass";

        questions[6][0] = "Diameter of an atom is in the order of";
        questions[6][1] = "0.2m";
        questions[6][2] = "0.2nm";
        questions[6][3] = "0.2mm";
        questions[6][4] = "0.2pm";

        questions[7][0] = "Which of the following terms is not used for ionic compound?";
        questions[7][1] = "molecular formula";
        questions[7][2] = "formula unit";
        questions[7][3] = "formula mass";
        questions[7][4] = "NOT";

        questions[8][0] = "Which one of the following has the maximum number of isotopes ?";
        questions[8][1] = "oxygen";
        questions[8][2] = "tin";
        questions[8][3] = "carbon";
        questions[8][4] = "chloride";

        questions[9][0] = "How many isotopes have odd atomic number ?";
        questions[9][1] = "86";
        questions[9][2] = "156";
        questions[9][3] = "129";
        questions[9][4] = "64";

        answers[0][1] = "JDB";
        answers[1][1] = "";
        answers[2][1] = "JJ Thomson";
        answers[3][1] = "Brass";
        answers[4][1] = "Plastic";
        answers[5][1] = "Gun water";
        answers[6][1] = "0.2nm";
        answers[7][1] = "molecular mass";
        answers[8][1] = "tin";
        answers[9][1] = "86";

        opt1 = new JRadioButton();
        opt1.setBounds(139, 221, 558, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(139, 286, 558, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(139, 366, 558, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(139, 435, 558, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt4);

        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);

        next = new JButton("Next");
        next.setBounds(779, 231, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        getContentPane().add(next);

        lifeline = new JButton("Lifeline");
        lifeline.setBounds(779, 328, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(30, 144, 255));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        getContentPane().add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(779, 435, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        getContentPane().add(submit);

        start(count);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            count++;
            start(count);
        } else if (ae.getSource() == lifeline) {
            if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        } else if (ae.getSource() == submit) {
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
                useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i][0].equals(answers[i][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(name, score);
        }
    }
    public void paint(Graphics g) {
        super.paint(g);

        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));

        if (timer > 0) {
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        timer--; // 14
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
    }
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);

        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);

        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);

        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);

        groupoptions.clearSelection();
    }
    public static void main(String[] args) {
        new Chemistry("User");
    }
}
