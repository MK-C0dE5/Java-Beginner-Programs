import java.awt.*;

class frameBorder extends Frame{
    frameBorder (String titlename){
        setTitle("194028 DCP");
        Panel p = new Panel();
        p.setLayout(new BorderLayout());
        Label l1 = new Label("194028");
        Label l2 = new Label("194028");
        Label l3 = new Label("194028");

        Checkbox cb = new Checkbox("194028");
        cb.setBounds(50, 50, 70, 30);
        p.add(cb, BorderLayout.CENTER);

        Button sb = new Button("194028");
        p.add(sb, BorderLayout.NORTH);

        l1.setBounds(50, 60, 70, 30);
        l2.setBounds(60, 60, 80, 80);
        l3.setBounds(60, 60, 70, 30);

        p.add(l1, BorderLayout.EAST);p.add(l2, BorderLayout.WEST);p.add(l3, BorderLayout.SOUTH);
        p.setVisible(true);

        add(p);

        setVisible(true);
        setSize(500,500);
    }
    public static void main(String args[]){
        frameBorder s = new frameBorder("194028");
    }
}
