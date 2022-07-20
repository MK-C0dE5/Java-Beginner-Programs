import java.awt.*;
class Border1 extends Frame{
    Border1(String s){
        super(s);
        Panel p1 = new Panel();
        p1.setLayout(new BorderLayout());
        p1.setBounds(30,60,400,400);
        p1.setBackground(Color.LIGHT_GRAY);
        Label l1 = new Label("Label 1");
        Label l2 = new Label("194029");
        Label l3 = new Label("Label 2");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Label l4 = new Label("                Welcome to Advanced Java");
        p1.add(l4, BorderLayout.CENTER);
        p1.add(l1, BorderLayout.EAST);
        p1.add(b1, BorderLayout.NORTH);
        p1.add(b2, BorderLayout.SOUTH);
        p1.add(l2, BorderLayout.WEST);
        add(p1);
        p1.setVisible(true);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
public static void main(String[] args){
     Border1 h1 = new Border1("Border Demonstration");
    }
}