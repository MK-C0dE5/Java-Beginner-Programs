import java.awt.*;
import java.awt.event.*;

class item_listener extends Frame implements ActionListener, ItemListener{
        TextField t1;
        TextArea t2;
        Label l3;
        Label l4;
        Checkbox c1;
        Checkbox c2;
    all_component(){
        Label l1 = new Label("Demonstration Action Listener");
        l1.setBounds(10,30,200,30);

        Button b1 = new Button("Click for Info");
        b1.setBounds(10,60,140,30);

        t1 = new TextField(25);
        t2 = new TextArea(150,70);
        t1.setBounds(10,95,150,30);
        t2.setBounds(10,130,200,70);

        b1.addActionListener(this);

        Label l2 = new Label("Demonstration of Item Listener");
        l2.setBounds(10,220,200,30);
        c1 = new Checkbox("C++", false);
        c1.setBounds(10,250,70,20);
        c2 = new Checkbox("Java", false);
        c2.setBounds(10,280,70,20);
        l3 = new Label();
        l3.setBounds(10,310,200,30);
        l4 = new Label();
        l4.setBounds(10,340,200,30);
        c1.addItemListener(this);
        c2.addItemListener(this);
        add(l1);add(t1);add(t2);add(b1);add(c1);
        add(c2);add(l2);add(l3);add(l4);
        setLayout(null);
        setSize(400,400);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        t1.setText("Hello, Welcome to Java");
        t2.setText("This is Demonstration of Action Listener");
    }
    public void itemStateChanged(ItemEvent e) {     
        if(e.getSource()==c1) 
            l3.setText("C++ Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));  
        if(e.getSource()==c2)
            l4.setText("Java Checkbox: "+(e.getStateChange()==1?"checked":"unchecked"));   
    }
    public static void main(String[] args) {
        new item_listener();
    }
}
