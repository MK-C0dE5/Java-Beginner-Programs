import java.awt.*;
public class label{
    label(String s){
        Frame f = new Frame(s);
        Panel p1 = new Panel();
        Label label1 = new Label("Label - 1");
        Label label2 = new Label("Label - 2");
        Label label3 = new Label("Label - 3");
        p1.setBounds(30,30,400,400);
        p1.setBackground(Color.gray);
        label1.setBounds(80,80,80,80);
        label2.setBounds(80,80,90,90);
        label3.setBounds(80,80,100,100);
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        b1.setBounds(30,30,20,20);
        b2.setBounds(40,40,50,50);
        b3.setBounds(60,60,50,50);
        CheckboxGroup cg1 = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Check1",false,cg1);
        Checkbox c2 = new Checkbox("Check2",false,cg1);
        Checkbox c3 = new Checkbox("Check1",false);
        Checkbox c4 = new Checkbox("Check2",false);
        c1.setBounds(40,40,40,40);
        c2.setBounds(50,50,40,40);
        c3.setBounds(40,40,40,40);
        c4.setBounds(50,50,80,80);
        List l = new List();
        l.add("Sunday");
        l.add("Monday");
        l.add("Tuseday");
        l.add("Wednesday");
        l.add("Thursdya");
        l.add("Friday");
        l.setBounds(10,280,100,70);
        // Label l2 = new Label("Enter your name: ");
        // TextField t1 = new TextField();
        // l2.setBounds(10,10,130,30);
        // t1.setBounds(140,360,180,30);
        // TextArea t2 = new TextArea("Hello World");
        // t2.setBounds(10,10,100,70);
        p1.add(label1);
        p1.add(label2);
        p1.add(label3);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        p1.add(c1);
        p1.add(c2);
        p1.add(c3);
        p1.add(c4);
        p1.add(l);
        // p1.add(t2);
        // p1.add(new TextArea("Hello world"));
        // p1.add(l2);
        // p1.add(t1);
        f.add(p1);
        f.setSize(600,600);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        label l1 = new label("Label Demonstration");
    }
}
