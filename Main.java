import javax.swing.*;
import java.awt.*;

/**
 * Presents a basic GUI window using JFrame.
 * @author Lily Nkantah
 */
public class Main {
    public static void main(String[] args) {
        // JFrame is a GUI window that you can add components to
        // 1 - frames. First displaying a basic GUI, no components yet
        JFrame frame = new JFrame(); //creates new frame
        frame.setTitle("My Java Swing App"); //sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes app exit when close button is pressed
        frame.setResizable(false); //user can't change size of frame, also can't make frame fullscreen though
        frame.setSize(420, 420); // sets x-dimension and y-dimension of frame
        frame.setVisible(true); //makes frame actually visible, not hidden

        ImageIcon image = new ImageIcon("images/solo-leveling.jpeg"); //creates an ImageIcon
        frame.setIconImage(image.getImage()); //change the icon of the frame
        frame.getContentPane().setBackground(new Color(89, 97, 148)); //change background colour
    }
}
