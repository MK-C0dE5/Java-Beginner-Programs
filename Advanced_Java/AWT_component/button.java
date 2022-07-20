import java.awt.*;
class firstawt{
    firstawt(){
        Frame f = new Frame("Hello");
        Button b = new Button("Click Here");
        b.setBounds(30,30,80,80);
        f.add(b);
        f.setSize(200,200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
class button{
    public static void main(String[] args) {
        firstawt f1 = new firstawt();
    }
}