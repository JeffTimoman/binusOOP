import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;
public class LoginFrame extends JFrame{
    
    private JLabel headerLabel = new JLabel("Login");
    private JLabel emaiLabel = new JLabel("Email");
    private JLabel passwordLabel = new JLabel("Password");

    private JTextField emailField = new JTextField();
    private JPasswordField passwordField = new JPasswordField();

    private JPanel footer = new JPanel();
    private JPanel content = new JPanel();
    
    private JButton submitBtn = new JButton("Submit");
    public LoginFrame(){
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(headerLabel, BorderLayout.NORTH);
        
        footer.add(submitBtn);
        add(footer, BorderLayout.SOUTH);

        content.setLayout(new GridLayout(2, 2));
        content.add(emaiLabel);
        content.add(emailField);
        content.add(passwordLabel);
        content.add(passwordField);

        add(content, BorderLayout.CENTER);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }
}
