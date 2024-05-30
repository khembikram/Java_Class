import javax.swing.*;

/**
 * SimpleFrame
 */
public class SimpleFrame extends JFrame {

    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 400;

    SimpleFrame() {
        // setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        // setLocation(500,200);

        // Using setBounds
        setBounds(500, 200, DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}