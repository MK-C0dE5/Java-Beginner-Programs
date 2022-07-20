import java.awt.*; 
import java.applet.*;
/*
   <applet code="applet1" width=300 height=50>
   </applet>
*/
class SampleFrame extends Frame
{
   SampleFrame(String title)
   {
      super(title);
   }
   public void paint(Graphics g)
   {
      g.drawString("This is in frame window", 10, 40);
   }    
}
public class applet1 extends Applet
{
   Frame f;
   public void init()
   {
      Panel p = new Panel();
      p.setBounds(0,0,300,300);
      f = new SampleFrame("A Frame Window");
      Label l1 = new Label("Label - 1");
      Button b1 = new Button("Click Here");
      Checkbox c1 = new Checkbox("Check 1", false);
      CheckboxGroup cg = new CheckboxGroup();
      Checkbox m1 = new Checkbox("Female",false, cg);
      Checkbox f1 = new Checkbox("Male",false, cg);
      Label l2 = new Label("Enter your name: ");
      TextField t1 = new TextField(20);
      List l = new List();
      l.add("Name");
      l.add("Address");
      l.add("Contact No");
      l1.setBounds(10,60,70,30);
      b1.setBounds(10,100,80,30);
      c1.setBounds(10,140,70,30);
      t1.setBounds(10,10,40,40);
      p.add(l1);
      p.add(b1);
      p.add(c1);
      p.add(m1);
      p.add(f1);
      p.add(l2);
      p.add(t1);
      p.add(l);
      f.add(p);
      f.setSize(400, 400);
      f.setVisible(true);
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