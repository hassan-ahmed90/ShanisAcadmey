import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Physics extends JFrame implements ActionListener {
    String questions[][] = new String[10][5];
    String answers[]= new String[10];
    String useranswers[]= new String[10];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;

    int timer = 15;
  int ans_given = 0;
    int count = 0;
  int score = 0;
    String name;
    Physics() {

        setBounds(50, 0, 1481, 697);
        getContentPane().setBackground(new Color(128, 255, 255));
        getContentPane().setLayout(null);

        qno = new JLabel();
        qno.setBounds(69, 142, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(qno);

        question = new JLabel();
        question.setBounds(139, 142, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        getContentPane().add(question);

        questions[0][0] = "A man is in a car is moving with velocity of 36km/hr. His speed with repect to the car is?";
        questions[0][1] = "10";
        questions[0][2] = "6";
        questions[0][3] = "0";
        questions[0][4] = "infinite";

        questions[1][0] = "Area under velocity time graph represent";
        questions[1][1] = "distance";
        questions[1][2] = "displacement";
        questions[1][3] = "velocity";
        questions[1][4] = "NOT";

        questions[2][0] = "Inertia of an object is quantitative measure of its?";
        questions[2][1] = "volume";
        questions[2][2] = "density";
        questions[2][3] = "mass";
        questions[2][4] = "NOT";

        questions[3][0] = "1st law of motion gives the definition of?";
        questions[3][1] = "force";
        questions[3][2] = "motion";
        questions[3][3] = "rest";
        questions[3][4] = "NOT";

        questions[4][0] = "What is the shape of velocity, time graph for constant acceleration ?";
        questions[4][1] = "Straight line";
        questions[4][2] = "curve";
        questions[4][3] = "parabola";
        questions[4][4] = "NOT";

        questions[5][0] = "Distance covered by a freely falling body in 2 seconds will be?";
        questions[5][1] = "14.9m";
        questions[5][2] = "4.9m";
        questions[5][3] = "6.4m";
        questions[5][4] = "1.2m";

        questions[6][0] = "At which angle the range of the projectile is maximum?";
        questions[6][1] = "45";
        questions[6][2] = "60";
        questions[6][3] = "30";
        questions[6][4] = "NOT";

        questions[7][0] = "Time rate of change of momentum is equal to?";
        questions[7][1] = "force";
        questions[7][2] = "imples";
        questions[7][3] = "velocity";
        questions[7][4] = "NOT";

        questions[8][0] = "Slope of velocity time graph is_?";
        questions[8][1] = "acceleration";
        questions[8][2] = "distance";
        questions[8][3] = "displacement";
        questions[8][4] = "NOT";

        questions[9][0] = "Which law of motion is also called law of inertia ?";
        questions[9][1] = "1st Law";
        questions[9][2] = "2nd Law";
        questions[9][3] = "3rd Law";
        questions[9][4] = "NOT";

        answers[0] = "0";
        answers[1] = "displacemnt";
        answers[2] = "mass";
        answers[3] = "force";
        answers[4] = "straight line";
        answers[5] = "1.2m";
        answers[6] = "45";
        answers[7] = "imples";
        answers[8] = "acceleration";
        answers[9] = "1st law";

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
                useranswers[count] = "";
            } else {
                useranswers[count] = groupoptions.getSelection().getActionCommand();
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
                useranswers[count] = "";
            } else {
                useranswers[count] = groupoptions.getSelection().getActionCommand();
            }

            for (int i = 0; i < useranswers.length; i++) {
                if (useranswers[i].equals(answers[i])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            setVisible(false);
            new Score(score);
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
                    useranswers[count] = "";
                } else {
                    useranswers[count] = groupoptions.getSelection().getActionCommand();
                }

                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i].equals(answers[i])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score( score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                    useranswers[count] = "";
                } else {
                    useranswers[count] = groupoptions.getSelection().getActionCommand();
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
        new Physics();
    }
}
