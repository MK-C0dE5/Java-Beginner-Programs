import java.awt.*;
public class calculator extends Frame{
    calculator(){
        setTitle("Calculator");
        setSize(500,500);
        setVisible(true);
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);

        gbc.fill = GridBagConstraints.VERTICAL;
        gbc.ipady = 10;
        gbc.ipadx = 100;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new TextField(), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 15;
        gbc.ipadx = 15;
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new Button("Button 1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(new Button("Button 2"), gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(new Button("Button 3"), gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(new Button("Button 4"), gbc);
    }
    public static void main(String[] args) {
        calculator c1 = new calculator();
    }
}