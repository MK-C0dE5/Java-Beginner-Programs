import java.awt.*;
class gridlayout extends Frame{
    gridlayout(){
        for(int i = 1; i<10; i++){
            add(new Button("" + i));
        }
        setSize(400,400);
        Panel p1 = new Panel();
        p1.setBounds(0,0,400,400);
        p1.setBackground(Color.GRAY);
        setLayout(new GridLayout(4,4));
        setVisible(true);
    }
    public static void main(String[] args){
        gridlayout g1 = new gridlayout();
    }
}