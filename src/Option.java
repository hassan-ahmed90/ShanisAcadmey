import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Option {
    private JFrame frame;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Option window = new Option();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Option() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 255, 255));
        frame.setBounds(100, 100, 761, 513);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("PHYSICS");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Physics();
            }
        });
        btnNewButton.setBounds(176, 181, 160, 57);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("CHEMISTRY");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Chemistry();
            }
        });
        btnNewButton_1.setBounds(418, 181, 139, 57);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("General Knowlegde");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = null;
                new General();
            }
        });
        btnNewButton_2.setBounds(176, 293, 160, 62);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("ENGLISH");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new English();
            }
        });
        btnNewButton_3.setBounds(418, 293, 139, 57);
        frame.getContentPane().add(btnNewButton_3);

        JLabel lblNewLabel = new JLabel("CHOOSE SUBJECT");
        lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
        lblNewLabel.setBounds(256, 37, 299, 93);
        frame.getContentPane().add(lblNewLabel);
        frame.setVisible(true);
    }
}
