import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("images/solo-leveling.jpeg");

        JLabel label = new JLabel();
        label.setText("We need a hero!");
        label.setIcon(image);
        //label.setVerticalAlignment(JLabel.BOTTOM); //only needed when using a border layout
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setIconTextGap(-1);
        label.setBounds(100, 25, 220, 220);

        // JPanel is a GUI component that acts as a container to hold other components
        JPanel pinkPanel = new JPanel();
        pinkPanel.setBackground(new Color(255, 148, 148)); //set colour of the panel
        pinkPanel.setBounds(0, 0, 250, 250); //set position of the panel
        pinkPanel.setLayout(null);

        JPanel tealPanel = new JPanel();
        tealPanel.setBackground(new Color(157, 250, 208)); //set colour of the panel
        tealPanel.setBounds(250, 0, 250, 250); //set position of the panel
        tealPanel.setLayout(null);

        JPanel limePanel = new JPanel();
        limePanel.setBackground(new Color(223, 250, 160)); //set colour of the panel
        limePanel.setBounds(0, 250, 500, 250); //set position of the panel
        limePanel.setLayout(null); //using a border layout for the panel

        JFrame frame = new JFrame();
        frame.setTitle("My Java Swing App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(750, 750);
        frame.setVisible(true);
        frame.setLayout(null);

        limePanel.add(label); //adding a label into a panel. label can only be in one panel at a time
        //pinkPanel.add(label);
        //tealPanel.add(label);
        frame.add(pinkPanel);
        frame.add(tealPanel);
        frame.add(limePanel);
    }
}
