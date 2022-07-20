import java.awt.*;
import java.awt.event.*;
class cardlayout extends Frame implements ActionListener{
    CardLayout card = new CardLayout(40,40);
    cardlayout(){
        setLayout(card);
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        add(b1, "Card1");
        add(b2, "Card2");
        add(b3, "Card3");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        card.next(this);
    }
    public static void main(String[] args) {
        cardlayout c1 = new cardlayout();
        c1.setTitle("Card Layout Demonstration");
        c1.setSize(500,500);
        c1.setVisible(true);
        c1.setResizable(false);
    }
}