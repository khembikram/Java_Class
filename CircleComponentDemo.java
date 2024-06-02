
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class ComponentDemo extends JComponent {

    private static final int DEFAULT_WIDTH = 400;
    private static final int DEFAULT_HEIGHT = 300;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        double centerX = 200;
        double centerY = 150;
        double radius = 100;

        double leftX = centerX - centerY;
        double leftY = centerY - radius;
        double diameter = 2 * radius;

        Ellipse2D circle = new Ellipse2D.Double(leftX, leftY, diameter, diameter);
        g2.draw(circle);
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

public class CircleComponentDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FrameDemo frame = new FrameDemo();
            frame.setTitle("Cicle 2D Drawing");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
