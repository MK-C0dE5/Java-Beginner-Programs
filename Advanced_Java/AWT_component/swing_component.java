import java.awt.*;
import javax.swing.*;
 
public class swing_component extends Frame{
   swing_component()
   {
       JLabel l1 = new JLabel("Button Demonstration");
       l1.setBounds(10,30,200,30);
       JButton b1 = new JButton("Button");
       b1.setBounds(10,60,90, 30);
 
       JLabel l2 = new JLabel("RadioButton Demonstration");
       l2.setBounds(10,90,200,30);
       JRadioButton rb1 = new JRadioButton("Radio Button1");
       rb1.setBounds(10,120,150,30);
       JRadioButton rb2 = new JRadioButton("Radio Button2");
       rb2.setBounds(190,120,150,30);
 
       JLabel l3 = new JLabel("CheckBox Demonstration");
       l3.setBounds(10,150,200,30);
       JCheckBox c1 = new JCheckBox("CheckBox1", false);
       c1.setBounds(10,180,150,30);
       JCheckBox c2 = new JCheckBox("CheckBox2", false);
       c2.setBounds(190,180,150,30);
 
       JLabel l4 = new JLabel("TextArea Demonstration");
       l4.setBounds(10,210,200,30);
       JTextArea t1 = new JTextArea();
       t1.setBounds(10,240,200,30);
 
       JLabel l5 = new JLabel("TextField Demonstration");
       l5.setBounds(10,270,200,30);
       JTextField t2 = new JTextField(25);
       t2.setBounds(10,300,200,50);

       String programming_language[] = {"C", "C++", "Python", "Java", "HTML", "CSS", "PHP"};
       JLabel l6 = new JLabel("List Demonstration");
       l6.setBounds(10,350,200,30);
       JList list1 = new JList(programming_language);
       list1.setSelectedIndex(2);
       list1.setBounds(10,380,150,85);

       JLabel l7 = new JLabel("ComboBox Demonstration");
       l7.setBounds(10,465,200,30);
       JComboBox cb1 = new JComboBox(programming_language);
       cb1.setBounds(10,495,150,35);

       add(l1);add(l2);add(l3);add(l4);add(l5);add(b1);add(rb1);
       add(c1);add(t1);add(t2);add(l6);add(list1);add(cb1);
       add(l7);add(rb2);add(c2);
       setSize(600,600);
       setLayout(null);
       setVisible(true);
   }
   public static void main(String[] args) {
       new swing_component();
   }
}
