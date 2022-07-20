import java.awt.*;
import java.awt.event.*;
class Panel1 extends Panel{
    Label l1,l2,l3,l4;
    Button b3,b4,b5,b6,b7;
    TextField t1,t2,t3;
    Panel1(){
        l1 = new Label("Number 1");
        t1 = new TextField(12);
        l2 = new Label("Number 2");
        t2 = new TextField(12);
        b3 = new Button("Add");
        b4 = new Button("Sub");
        b5 = new Button("Mul");
        b6 = new Button("Div");
        l3 = new Label("Result");
        t3 = new TextField(20);
        t3.setEditable(false);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(l3);
        add(t3);
    }
}
class Panel2 extends Panel{
    Checkbox cb1, cb2, cb3, cb4;
    Panel2(){
        cb1 = new Checkbox("Windows");
        cb2 = new Checkbox("Mac");
        cb3 = new Checkbox("Android");
        cb4 = new Checkbox("Webgl");
        setLayout(new GridLayout(2,2));
        add(cb1);
        add(cb2);
        add(cb3);
        add(cb4);
    }
}

class Panel3 extends Panel{
    TextArea ta;
    TextField t1, t2;
    Label l1, l2;
    Button b1,b2,b3,b4;
    Panel3(){
        ta = new TextArea();
        l1 = new Label("Find");
        t1 = new TextField(20); 
        l2 = new Label("Replace");
        t2 = new TextField(30);
        b1 = new Button("Find");
        b2 = new Button("Replace");
        b3 = new Button("Replace All");
        b4 = new Button("Cancel");

        add(ta);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
    }
}
class cardlayout2 extends Frame implements ActionListener{
    Button b1, b2;
    Panel card;
    CardLayout c;
    Panel1 p1;
    Panel2 p2;
    Panel3 p3;
    public cardlayout2(String title){
        super(title);
        setSize(540,540);
        setVisible(true);
        c = new CardLayout();
        BorderLayout br = new BorderLayout();
        b1 = new Button("Previous");
        b2 = new Button("Next");
        card = new Panel();
        card.setLayout(c);
        p1 = new Panel1();
        p2 = new Panel2();
        p3 = new Panel3();
        card.add(p1, "Panel1");
        card.add(p2, "Panel2");
        card.add(p3, "Panel3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        Panel p = new Panel();
        p.add(b1);
        p.add(b2);
        add(p, BorderLayout.NORTH);
        add(card, BorderLayout.CENTER);
}
public void actionPerformed(ActionEvent e){
    if(e.getSource() == b2)
    c.next(card);
    else
    c.previous(card);
}
public static void main(String[] args) {
    new cardlayout2("Card Demonstration");
}
}