import javax.sound.midi.Synthesizer;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;


public class MainFrame extends JFrame implements ActionListener{
    
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenuItem exitMenuItem = new JMenuItem("Exit");
    JMenuItem loginMenuItem = new JMenuItem("Login");
    
    JDesktopPane desktopPane = new JDesktopPane();


    public MainFrame(){
        menuBar.add(fileMenu);
        fileMenu.add(loginMenuItem);
        fileMenu.add(new JMenuItem("Logout"));
        // fileMenu.add(new JSeparator());
        String menu[] = {"Copy", "Paste"};
        for(String item : menu){
            JMenuItem menuItem = new JMenuItem(item);
            menuItem.addActionListener(this);
            fileMenu.add(menuItem);
        }
        fileMenu.addSeparator();
        fileMenu.add(exitMenuItem);

        exitMenuItem.addActionListener(this);
        loginMenuItem.addActionListener(this);
        setJMenuBar(menuBar);

        setContentPane(desktopPane);

        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JInternalFrame frame  = null;
        // TODO Auto-generated method stub
        if(e.getSource() == exitMenuItem){
            dispose();
            System.exit(0);
        }

        if(e.getSource() instanceof JMenuItem menu){
            if(menu.getText().equals("Login")){
                // JFrame frame = new JFrame();
                // frame.setSize(300, 300);
                // frame.setVisible(true);
                if(frame == null || frame.isClosed()){
                    frame = new JInternalFrame("Login", true, true, true, true);
                    Vector<String> header = new Vector<>();
                    header.add("Student ID");
                    header.add("Name");
                    header.add("Score");
                    Vector<Vector<String>> data = new Vector<>();
                    Vector<String> row = new Vector<>();
                    row.add("B6011234");
                    row.add("Budi");
                    row.add("100");
                    data.add(row);
                    row = new Vector<>();
                    row.add("B6011235");
                    row.add("Susi");
                    row.add("90");
                    data.add(row);
                    DefaultTableModel dtm = new DefaultTableModel(data, header); 
                    JTable table = new JTable(dtm);
                    frame.add(table);
                }
                frame.setVisible(true);
                frame.setBounds(50, 50, 200, 200);
            }
        }
    }
}
