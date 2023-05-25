import javax.swing.JMenu;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class file extends JFrame{
    JFrame j1;
    JMenuBar jm1;
    JMenuItem jm2, jm3, jm4, jm5;
    JMenu m1, m2;
    JPanel p1;
    file(){
        j1 = new JFrame("Scan");
        

        jm1 = new JMenuBar();
        m1 = new JMenu("File");
        jm1.add(m1);
        m2 = new JMenu("Help");
        jm1.add(m2);
        jm2 = new JMenuItem("Open");
        jm3 = new JMenuItem("Save as");
        m1.add(jm2);
        m1.add(jm3);

        p1 = new JPanel();
        JLabel l1 = new JLabel("Enter Text: ");
        JTextField t1=new JTextField(10);
        JButton b1 = new JButton("Send");
        JButton b2 = new JButton("Reset");
        p1.add(l1);
        p1.add(t1);
        p1.add(b1);
        p1.add(b2);

        JTextArea ta1 = new JTextArea();

        j1.getContentPane().add(BorderLayout.SOUTH, p1);
        j1.getContentPane().add(BorderLayout.NORTH, jm1);
        j1.getContentPane().add(BorderLayout.CENTER, ta1);
        

        j1.setSize(400,400);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j1.setVisible(true);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String text = t1.getText();
                ta1.append(text + "\n");
                t1.setText("");
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                ta1.setText("");
            }
        });

        jm2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              JFileChooser fileChooser = new JFileChooser();
              int result = fileChooser.showOpenDialog(j1);
              if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                  String line;
                  while ((line = reader.readLine()) != null) {
                    ta1.append(line + "\n");
                  }
                } catch (IOException ex) {
                  ex.printStackTrace();
                }
              }
            }
          });

          jm3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              JFileChooser fileChooser = new JFileChooser();
              int result = fileChooser.showSaveDialog(j1);
              if (result == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                  String text = ta1.getText();
                  writer.write(text);
                } catch (IOException ex) {
                  ex.printStackTrace();
                }
              }
            }
          });
    }

}
public class _9_Swing1 {
    public static void main(String[] args) {
        file f1 = new file();
    }   
}
