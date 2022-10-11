import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class General extends JFrame implements ActionListener {
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
    General(String name) {
        this.name = name;
        setBounds(50, 0, 1481, 697);
        getContentPane().setBackground(new Color(0, 255, 255));
        getContentPane().setLayout(null);

        qno = new JLabel();
        qno.setBounds(69, 142, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);

        question = new JLabel();
        question.setBounds(139, 142, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);

        questions[0][0] = "Which Asian Country recently unveiled its National Security Policy (NSP)?";
        questions[0][1] = "Srilanka";
        questions[0][2] = "Afghanistan";
        questions[0][3] = "Pakistan";
        questions[0][4] = "Bangladesh";

        questions[1][0] = "What is the Sex Ratio at Birth (SRB) of India in the year 2020-21?";
        questions[1][1] = "918";
        questions[1][2] = "920";
        questions[1][3] = "937";
        questions[1][4] = "951";

        questions[2][0] = "What was the name of the first US atomic submarine launched in 1954?";
        questions[2][1] = "Nautillus";
        questions[2][2] = "Sea lion";
        questions[2][3] = "Washington";
        questions[2][4] = "Tando Adam";

        questions[3][0] = "Which Pakistani fast bowler was DSP in Police?";
        questions[3][1] = "Fazal Muhammad";
        questions[3][2] = "Zaheer Abbas";
        questions[3][3] = "Shani";
        questions[3][4] = "Inzamamul Haq";

        questions[4][0] = "Cambodia is a _________ asian country?";
        questions[4][1] = "South East";
        questions[4][2] = "South west";
        questions[4][3] = "North South";
        questions[4][4] = "West jamshoro";

        questions[5][0] = "International Day of Democracy is Celebrated Every Year on ______________?";
        questions[5][1] = "15 September";
        questions[5][2] = "15 Oct ";
        questions[5][3] = "15 December";
        questions[5][4] = "14 August";

        questions[6][0] = "Which animal’s milk is black?";
        questions[6][1] = "Hippopotamus";
        questions[6][2] = "Black Rhinoceroces";
        questions[6][3] = "Bat";
        questions[6][4] = "Milk always white";

        questions[7][0] = "Largest Temple of the World?";
        questions[7][1] = "Angkor Wat";
        questions[7][2] = "Belur Math";
        questions[7][3] = "Akshardam";
        questions[7][4] = "None of these";

        questions[8][0] = "Cinnamon air is the airline of which country?";
        questions[8][1] = "Srilanka";
        questions[8][2] = "Iraq";
        questions[8][3] = "Iran";
        questions[8][4] = "Pakistan";

        questions[9][0] = "Interfax is the news agency of";
        questions[9][1] = "London";
        questions[9][2] = "Russia";
        questions[9][3] = "South Afriaca";
        questions[9][4] = "France";

        answers[0][1] = "Paksitan";
        answers[1][1] = "937";
        answers[2][1] = "Tando Adam";
        answers[3][1] = "Shani";
        answers[4][1] = "South East";
        answers[5][1] = "15 September";
        answers[6][1] = "bat";
        answers[7][1] = "None of these";
        answers[8][1] = "Srilanka";
        answers[9][1] = "France";

        opt1 = new JRadioButton();
        opt1.setBounds(139, 221, 482, 30);
        opt1.setBackground(new Color(128, 255, 255));
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(139, 286, 482, 30);
        opt2.setBackground(new Color(128, 255, 255));
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(139, 359, 482, 30);
        opt3.setBackground(new Color(128, 255, 255));
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        getContentPane().add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(139, 423, 482, 30);
        opt4.setBackground(new Color(128, 255, 255));
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
        next.setBackground(new Color(0, 0, 128));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        getContentPane().add(next);

        lifeline = new JButton("HINT");
        lifeline.setBounds(779, 314, 200, 40);
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(0, 0, 128));
        lifeline.setForeground(Color.WHITE);
        lifeline.addActionListener(this);
        getContentPane().add(lifeline);

        submit = new JButton("Submit");
        submit.setBounds(779, 402, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(0, 0, 128));
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
        new General("User");
    }
}