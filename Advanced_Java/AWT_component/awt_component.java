//Creating Frame and Adding Components
import java.awt.*;
public class awt_component extends Frame{
    awt_component(String s){
        super(s);
        Label l1 = new Label("Label Demonstration");
        l1.setBounds(10,30,150,30);

        Label l2 = new Label("Button Demonstration");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        l2.setBounds(10,60,150,30);
        b1.setBounds(10,90,60,30);
        b2.setBounds(10,120,60,30);

        Label l3 = new Label("CheckBox Demonstration");
        Checkbox c3 = new Checkbox("Check1",false);
        Checkbox c4 = new Checkbox("Check2",false);
        l3.setBounds(10,150,150,30);
        c3.setBounds(10,180,60,30);
        c4.setBounds(10,210,60,30);

        Label l4 = new Label("CheckBoxGroup Demonstration");
        CheckboxGroup cg1 = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male",false,cg1);
        Checkbox c2 = new Checkbox("Female",false,cg1);
        l4.setBounds(10,240,210,30);
        c1.setBounds(10,270,60,30);
        c2.setBounds(10,300,60,30);

        Label l5 = new Label("List Demonstration");
        List l = new List();
        l.add("Sunday");
        l.add("Monday");
        l.add("Tuseday");
        l.add("Wednesday");
        l.add("Thursdya");
        l.add("Friday");
        l5.setBounds(10,330,150,30);
        l.setBounds(10,360,100,70);

        Label l8 = new Label("TextField Demonstration");
        Label l6 = new Label("Enter your name: ");
        TextField t1 = new TextField(25);
        l8.setBounds(10,450,180,30);
        l6.setBounds(10,480,150,30);
        t1.setBounds(180,480,240,30);

        Label l7 = new Label("TextArea Demonstration");
        String msg = "Hello world";
        TextArea t2= new TextArea(msg);
        l7.setBounds(10,510,180,30);
        t2.setBounds(10,540,150,60);

        add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);
        add(l8);add(b1);add(b2);add(c1);add(c2);add(c3);add(c4);
        add(l);add(l2);add(t1);add(t2);

        setSize(600,600);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        awt_component f1 = new awt_component("Frame");
    }
}
