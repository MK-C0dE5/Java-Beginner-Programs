import java.awt.*;
class Layout extends Frame{
    Layout(){
        setTitle("Layout Demonstration");
        Panel p1 = new Panel();
        p1.setLayout(new FlowLayout());
        Label l1 = new Label("Demonstration of Layout Manager and Panel");
        l1.setFont(new Font("Arial", Font.BOLD, 18));
        p1.add(l1,BorderLayout.WEST);
        add(p1,BorderLayout.NORTH);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(2,3));
        for(int i = 1; i<=6; i++){
            p2.add(new Button(""+i));
        }
        add(p2,BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Layout();
    }
}