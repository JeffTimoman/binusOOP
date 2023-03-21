import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.WindowListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame implements ActionListener, WindowListener, MouseListener, MouseMotionListener{
    public static void main(String[] args) {
        new MainFrame();
        
    }

    private JButton btn = new JButton("Click me");
    private JButton btn2 = new JButton("South");
    private JButton btn3 = new JButton("North");

    private int count = 0;
    
    private ActionListener actionBtn3 = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e) {
           count++;
           btn3.setText("North " + count);
        }
    };

    public MainFrame(){
        super("Main Frame");

        btn.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(actionBtn3);
        add(btn);
        add(btn2, "South");
        add(btn3, "North");

        addWindowListener(this);
        addMouseListener(this);
        addMouseMotionListener(this);
        

        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        if(e.getSource() == btn){
            System.out.println("Button clicked");
            JOptionPane.showMessageDialog(this, "Hello World!");
            String name = JOptionPane.showInputDialog(this, "Enter your name: ");
            System.out.println("Name: " + name);
            int result = JOptionPane.showConfirmDialog(this, "Are you sure?");
            System.out.println("Result: " + result);
        }else if(e.getSource() == btn2){
            JOptionPane.showMessageDialog(this, "South button clicked");
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse dragged: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse moved: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse clicked: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse pressed: " + e.getX() + ", " + e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Mouse released: " + e.getX() + ", " + e.getY());
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window opened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window closing");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window closed");   
    }

    @Override
    public void windowIconified(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window iconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window deiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window activated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Window deactivated");
    }
}