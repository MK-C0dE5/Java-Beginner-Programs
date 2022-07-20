import java.awt.*;
public class button1 {
    button1(String s){
        Frame f2 = new Frame(s);
        Panel p2 = new Panel();
        p2.setBounds(80,80,100,100);
        p2.setBackground(Color.gray);
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        b1.setBounds(80,80,80,80);
        b2.setBounds(80,80,90,90);
        b3.setBounds(80,80,100,100);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        f2.add(p2);
        f2.setSize(300,300);                                                                                                                            
        f2.setLayout(null);
        f2.setVisible(true);
        }
        public static void main(String[] args) {
            button1 b1 = new button1("Button Demonstration");
        }
    }
