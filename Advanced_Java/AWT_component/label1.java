import java.awt.*;
public class label1 {
    label1(){
        Frame f1 = new Frame("Demonstration");
        Panel p1 = new Panel();
        p1.setBounds(30,60,400,400);
        p1.setBackground(Color.LIGHT_GRAY);

        Label l1 = new Label("Name: Mayur Satish Khadde");
        Label l2 = new Label("\nRoll No: 194029");
        l1.setBounds(-100,-100,0,0);
        l2.setBounds(-100,-100,0,0);

        p1.add(l1);
        p1.add(l2);
        f1.add(p1);
        f1.setSize(600,600);
        f1.setLayout(null);
        f1.setVisible(true);
          
    }
    public static void main(String[] args) {
        label1 l = new label1();
    }

} 

