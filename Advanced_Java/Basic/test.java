import java.awt.*;
import java.awt.event.*;
class test extends Frame implements ActionListener{
    Label l1;
    test(){
        l1 = new Label();
        Button b1 = new Button("Click Here");
        b1.setBounds(10,40,80,25);
        l1.setBounds(10,65,100,25);
        b1.addActionListener(this);
        add(l1);
        add(b1);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(l1 = "Hello world")
        {
            l1.setText("");
        }
        else
        {
            l1.setText("Hello world");
        }
    }
    public static void main(String args[]){
        new test();
    }
}