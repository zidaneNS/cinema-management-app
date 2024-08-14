package frame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginFrame extends JFrame {
    public static void main(String[] args) {
        new LoginFrame();
    }

    public LoginFrame() {
        // Setting for main frame
        setTitle("Login as");
        setSize(new Dimension(720, 720));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Creating title label
        JLabel titleLabel = new JLabel("Welcome to Amba-Cinema", JLabel.CENTER);
        add(titleLabel, BorderLayout.NORTH);

        // Creating buttons for admin or user
        JButton adminButton = new JButton("Login as Admin");
        JButton userButton = new JButton("Login as User");

        // Panel to hold buttons and arrange them vertically
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(userButton);
        buttonPanel.add(adminButton);

        // Adding action for login as admin
        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This will be executed as an admin");
            }
        });

        // Adding action for login as user
        userButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("This will be executed as a user");
            }
        });

        // Adding button panel to the center of the frame
        add(buttonPanel, BorderLayout.CENTER);

        // Making frame visible
        setVisible(true);
    }

}
