import java.awt.*;
public class gridcardlayout extends Frame{
    gridcardlayout(){
        setTitle("Grid Card Layout Demonstration");
        setSize(500,500);
        setVisible(true);
        GridBagLayout gb = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        setLayout(gb);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipady = 20;
        gbc.ipadx = 20;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new Button("Button 1"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new Button("Button 2"), gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        add(new Button("Button 3"), gbc);

        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.ipady = 20;
        gbc.ipadx = 20;
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new Button("Button 4"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(new Button("Button 5"), gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(new Button("Button 6"), gbc);
        
        gbc.fill = GridBagConstraints.HORIZONTAL; 
        gbc.ipady = 20;
        gbc.ipady = 20;
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new Button("Button 7"), gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(new Button("Button 8"), gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(new Button("Button 9"), gbc);

    }
    public static void main(String[] args) {
        gridcardlayout n1 = new gridcardlayout();
    }
}