// Write a program to display a date picker 
// and display the selected date in a text field.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/**
 * datepickerpgm
 */
public class datepickerpgm {
    JFrame f;
    JTextField tf;
    JDateChooser dc;
    datepickerpgm() {
        f = new JFrame("Date Picker");
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField();
        tf.setBounds(50, 50, 150, 20);
        dc = new JDateChooser();
        dc.setBounds(50, 100, 150, 20);
        f.add(tf);
        f.add(dc);
        dc.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                if ("date".equals(evt.getPropertyName())) {
                    tf.setText(dc.getDate().toString());
                }
            }
        });
    }
    public static void main(String[] args) {
    
    }
    
}
