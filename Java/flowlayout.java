import java.awt.*;
import java.applet.*;
/*
   <applet code="flowlayout" width=300 height=300>
   </applet>
*/
public class flowlayout extends Applet{
    Frame f;    
    public void init(){
        f = new Frame("FlowLayout Demonstration");
        for(int i=0; i<12; i++){
            f.add(new Button("" + i));
        }
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.LEFT, 70, 70));
    }
    public void start()
    {
        f.setVisible(true);
    }
    public void stop()  
    {
        f.setVisible(false);
    }  
    public void paint(Graphics g)
    {
        g.drawString("This is in applet window", 10, 20);
    }
}
