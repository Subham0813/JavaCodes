package Others;// importing awt and event packages
import java.awt.*;
import java.awt.event.*;

// class that implements KeyListener interface
public class KeyboardEventExample extends Frame implements KeyListener {
    // class constructor
    KeyboardEventExample() {

        // adding the KeyListener to the frame
        addKeyListener(this);

        // setting the size, layout, and visibility of the frame
        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }
    // overriding the keyPressed method of KeyListener interface
    public void keyPressed(KeyEvent e) {
        // getting the key code of the key pressed
        int keyCode = e.getKeyCode();

        // changing the background color of the frame depending on the key code
        switch (keyCode) {
            case KeyEvent.VK_R: // if R key is pressed
                setBackground(Color.RED); // set background color to red
                break;
            case KeyEvent.VK_G: // if G key is pressed
                setBackground(Color.GREEN); // set background color to green
                break;
            case KeyEvent.VK_B: // if B key is pressed
                setBackground(Color.BLUE); // set background color to blue
                break;
            case KeyEvent.VK_ESCAPE: // if ESC key is pressed
                System.exit(0); // exit the program
                break;
        }
    }
    // overriding the keyReleased method of KeyListener interface
    public void keyReleased(KeyEvent e) {
        // do nothing
    }
    // overriding the keyTyped method of KeyListener interface
    public void keyTyped(KeyEvent e) {
        // printing typed Key in Console
        char keyTyped = e.getKeyChar();
        System.out.println("keyTyped : "+keyTyped);
    }
    // main method
    public static void main(String[] args) {
        new KeyboardEventExample();
    }
}