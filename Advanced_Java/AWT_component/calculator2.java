import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator2 implements ActionListener{
    double first,second,result;
    String operator;
    Frame frame;
    Button one,two,three,four,five,six,seven,eight,nine,zero,add,sub,mult,div,equal, ac, on, off,dot, sin, cos, tan, sqrt, cbrt, square, cube, pow, pie, log, exp;
    TextField textscreen;
    calculator2(){
        Frame frame = new Frame("Scientific Calculator");
        ac = new Button("AC");
        on = new Button("ON");
        off = new Button(("OFF"));
        zero = new Button("0");
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");
        five = new Button("5");
        six = new Button("6");
        seven = new Button("7");
        eight = new Button("8");
        nine = new Button("9");
        add = new Button("+");
        sub = new Button("-");
        mult = new Button("*");
        div = new Button("/");
        equal = new Button("=");
        dot = new Button(".");
        sin = new Button("Sin ");
        cos = new Button("Cos ");
        tan = new Button("Tan ");
        cbrt = new Button("³√x");
        sqrt = new Button("²√x");
        log = new Button("Log");
        exp = new Button("eˣ");
        square = new Button("x²");
        cube = new Button("x³");
        pow = new Button("xʸ");
        pie = new Button("π");
        textscreen = new TextField();

        Font font1 = new Font("SanSerif", Font.PLAIN, 20);
        ac.setFont(font1);
        on.setFont(font1);
        off.setFont(font1);
        zero.setFont(font1);
        one.setFont(font1);
        two.setFont(font1);
        three.setFont(font1);
        four.setFont(font1);
        five.setFont(font1);
        six.setFont(font1);
        seven.setFont(font1);
        eight.setFont(font1);
        nine.setFont(font1);
        add.setFont(font1);
        sub.setFont(font1);
        mult.setFont(font1);
        div.setFont(font1);
        textscreen.setFont(font1);
        equal.setFont(font1);
        dot.setFont(font1);
        sin.setFont(font1);
        cos.setFont(font1);
        tan.setFont(font1);
        cbrt.setFont(font1);
        sqrt.setFont(font1);
        log.setFont(font1);
        exp.setFont(font1);
        square.setFont(font1);
        cube.setFont(font1);
        pow.setFont(font1);
        pie.setFont(font1);

        frame.setLayout(null);
        textscreen.setBounds(30, 40, 340, 80);
        on.setBounds(100, 130, 60, 60);
        off.setBounds(170, 130, 60, 60);
        ac.setBounds(30, 130, 60, 60);
        zero.setBounds(100, 410, 60, 60);
        one.setBounds(30, 340, 60, 60);
        two.setBounds(100, 340, 60, 60);
        three.setBounds(170, 340, 60, 60);
        four.setBounds(30, 270, 60, 60);
        five.setBounds(100, 270, 60, 60);
        six.setBounds(170, 270, 60, 60);
        seven.setBounds(30, 200, 60, 60);
        eight.setBounds(100, 200, 60, 60);
        nine.setBounds(170, 200, 60, 60);
        add.setBounds(240, 340, 60, 60);
        sub.setBounds(240, 270, 60, 60);
        mult.setBounds(240, 200, 60, 60);
        div.setBounds(240, 130, 60, 60);
        equal.setBounds(310, 480, 60, 60);
        dot.setBounds(170, 410, 60, 60);
        sin.setBounds(100, 480, 60, 60);
        cos.setBounds(170, 480, 60, 60);
        tan.setBounds(240, 480, 60, 60);
        sqrt.setBounds(30, 410, 60, 60);
        cbrt.setBounds(30, 480, 60, 60);
        log.setBounds(240, 410, 60, 60);
        exp.setBounds(310, 200, 60, 60);
        square.setBounds(310, 270, 60, 60);
        cube.setBounds(310, 340, 60, 60);
        pow.setBounds(310, 410, 60, 60);
        pie.setBounds(310, 130, 60, 60);

        frame.add(textscreen);
        frame.add(ac);
        frame.add(on);
        frame.add(off);
        frame.add(zero);
        frame.add(one);
        frame.add(two);
        frame.add(three);
        frame.add(four);
        frame.add(five);
        frame.add(six);
        frame.add(seven);
        frame.add(eight);
        frame.add(nine);
        frame.add(add);
        frame.add(sub);
        frame.add(mult);
        frame.add(div);
        frame.add(equal);
        frame.add(dot);
        frame.add(sin);
        frame.add(cos);
        frame.add(tan);
        frame.add(sqrt);
        frame.add(cbrt);
        frame.add(log);
        frame.add(exp);
        frame.add(pie);
        frame.add(square);
        frame.add(cube);
        frame.add(pow);

        on.addActionListener(this);
        off.addActionListener(this);
        ac.addActionListener(this);
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mult.addActionListener(this);
        div.addActionListener(this);
        equal.addActionListener(this);
        dot.addActionListener(this);
        sin.addActionListener(this);
        cos.addActionListener(this);
        tan.addActionListener(this);
        sqrt.addActionListener(this);
        cbrt.addActionListener(this);
        log.addActionListener(this);
        pow.addActionListener(this);
        exp.addActionListener(this);
        square.addActionListener(this);
        cube.addActionListener(this);
        pie.addActionListener(this);

        off.setEnabled(false);
        state(false);

        frame.setVisible(true);
        frame.setSize(400,600);
    }

    public static void main(String[] args){
        calculator2 myclass = new calculator2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String value = e.getActionCommand();
        switch(value) {
            case "on":
                on.setEnabled(false);
                state(true);
                off.setEnabled(true);
                break;
            case "off":
                state(false);
                off.setEnabled(false);
                on.setEnabled(true);
                break;
            
        }
    }
    public void state(boolean val) {
        textscreen.setText("");
        ac.setEnabled(val);
        mult.setEnabled(val);
        zero.setEnabled(val);
        one.setEnabled(val);
        two.setEnabled(val);
        three.setEnabled(val);
        four.setEnabled(val);
        five.setEnabled(val);
        six.setEnabled(val);
        seven.setEnabled(val);
        eight.setEnabled(val);
        nine.setEnabled(val);
        add.setEnabled(val);
        sub.setEnabled(val);
        div.setEnabled(val);
        equal.setEnabled(val);
        dot.setEnabled(val);
        sin.setEnabled(val);
        cos.setEnabled(val);
        tan.setEnabled(val);
        sqrt.setEnabled(val);
        cbrt.setEnabled(val);
        log.setEnabled(val);
        cube.setEnabled(val);
        square.setEnabled(val);
        pie.setEnabled(val);
        pow.setEnabled(val);
        exp.setEnabled(val);
    }
}