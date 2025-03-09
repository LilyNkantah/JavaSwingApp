import javax.swing.*;
import java.awt.*;

/**
 * Presents a basic GUI window using JFrame.
 *  * @author Lily Nkantah
 */
public class MyFrame extends JFrame {
    public MyFrame() {
        // JFrame is a GUI window that you can add components to
        // 1 - frames. First displaying a basic GUI, no components yet
        // JFrame this = new JFrame(); creates new this [ not needed when in the class definition as it's done when an
        // instance is created ]
        this.setTitle("My Java Swing App"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //makes app exit when close button is pressed
        this.setResizable(false); //user can't change size of this, also can't make this fullscreen though
        this.setSize(420, 420); // sets x-dimension and y-dimension of this
        this.setVisible(true); //makes this actually visible, not hidden

        ImageIcon image = new ImageIcon("images/solo-leveling.jpeg"); //creates an ImageIcon
        this.setIconImage(image.getImage()); //change the icon of the this
        this.getContentPane().setBackground(new Color(89, 97, 148)); //change background colour
    }
}
