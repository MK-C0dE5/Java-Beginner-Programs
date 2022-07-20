//Creating Frame and Adding Components
import java.awt.*;
public class frame extends Frame{
    frame(String s){
        super(s);
        Label l1 = new Label("Label Demonstration");
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        CheckboxGroup cg1 = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male",false,cg1);
        Checkbox c2 = new Checkbox("Female",false,cg1);
        Checkbox c3 = new Checkbox("Check1",false);
        Checkbox c4 = new Checkbox("Check2",false);
        l1.setBounds(10,30,150,50);
        b1.setBounds(10,70,60,30);
        b2.setBounds(10,120,60,30);
        c1.setBounds(10,160,60,30);
        c2.setBounds(10,190,60,30);
        c3.setBounds(10,220,60,30);
        c4.setBounds(10,250,60,30);
        List l = new List();
        l.add("Sunday");
        l.add("Monday");
        l.add("Tuseday");
        l.add("Wednesday");
        l.add("Thursdya");
        l.add("Friday");
        l.setBounds(10,280,100,70);
        Label l2 = new Label("Enter your name: ");
        TextField t1 = new TextField();
        l2.setBounds(10,360,130,30);
        t1.setBounds(140,360,180,30);
        //ChoiceBox ch1 = new ChoiceBox();
        String msg = "Hello world";
        TextArea t2= new TextArea(msg);
        t2.setBounds(10,400,150,60);
        add(l1);
        add(b1);
        add(b2);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(l);
        add(l2);
        add(t1);
        add(t2);
        setSize(500,500);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        frame f1 = new frame("Frame");
    }

}
