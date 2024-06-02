
import java.awt.*;
import java.awt.geom.Ellipse2D;
import javax.swing.*;

class ComponentDemo extends JComponent {

    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;

    protected void paintComponent(Graphics2D g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        double lefX = 50;
        double topY = 50;
        double width = 200;
        double height = 150;

        Ellipse2D ellipse = new Ellipse2D.Double(lefX, topY, width, height);
        g2.draw(ellipse);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class FrameDemo extends JFrame {

    public FrameDemo() {
        add(new ComponentDemo());
        pack();
    }
}

public class EllipseComponent {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(()->{
            FrameDemo frame = new FrameDemo();
            frame.setTitle("Ellipse 2D Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
