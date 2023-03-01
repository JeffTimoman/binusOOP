import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Ini adalah frame!");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 3));
        JButton btn = new JButton("Click Me!");
        panel.add(btn);
        JButton btn1 = new JButton("Click Me!");
        panel.add(btn1);
        for (int i = 0; i < 10; i++) {
            panel.add(new JButton(("Button" + i)));
        }
        frame.add(panel);

        JLabel label = new JLabel("Ini Label");
        frame.add(label, BorderLayout.NORTH);
        
        JTextField textField = new JTextField();
        frame.add(textField, BorderLayout.SOUTH);

        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
