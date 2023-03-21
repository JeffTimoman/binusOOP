import javax.swing.*;
import java.awt.*;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class LoginFrameJep {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Login Page");
        JLabel loginlabel = new JLabel("Login");
        JLabel usernamelabel = new JLabel("Username");
        JLabel passwordlabel = new JLabel("Password");
        JTextField usernamefield = new JTextField();
        JPasswordField passwordfield = new JPasswordField();
        JButton loginbutton = new JButton("Submit");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 2));
        panel.add(usernamelabel);
        panel.add(usernamefield);
        panel.add(passwordlabel);
        panel.add(passwordfield);

        frame.add(loginlabel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);
        frame.add(loginbutton, BorderLayout.SOUTH);

        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
