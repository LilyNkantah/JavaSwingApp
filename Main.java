import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageIcon image = new ImageIcon("images/solo-leveling.jpeg");
        Border border = BorderFactory.createLineBorder(new Color(89, 97, 148), 5); //create a border

        // JLabel is a GUI component that functions as a display area for strings of text and images. Note that layout
        // manager by default sets label to take up entire frame
        JLabel label = new JLabel(); //create a label
        label.setText("Arise"); //set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT, CENTER, or RIGHT of image
        label.setVerticalTextPosition(JLabel.TOP); //set text TOP, CENTER, BOTTOM of image
        label.setForeground(new Color(89, 97, 148)); //set font colour
        label.setFont(new Font("MV Boli", Font.ITALIC, 15)); //set text font
        label.setIconTextGap(10); //set gap of text to image
        label.setBackground(new Color(255, 250, 115)); //set background colour
        label.setOpaque(true); //display background colour
        label.setBorder(border); //set border for label
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of label (contents of label i.e. text and image)
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of label
        label.setBounds(50, 50, 350, 350); //set position of top left, top right corner of label, width, height of label

        JFrame frame = new JFrame(); //don't have to give it a name if you don't plan on using its name, -> if you
        // just need to create a frame, do new MyFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); //setting layout manager to null so we can manually control size of label
        frame.setVisible(true);
        frame.add(label); // add the label to the frame
        //frame.pack(); resizes size of frame to accommodate all components in the frame. layout manager needs to be on,
        // and label bounds cannot be manually set, frame size cannot be manually set

    }
}
