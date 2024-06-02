
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

class ComponentDemo extends JComponent {

    private  static  final  int  DEFAULT_WIDTH = 500;
    private  static  final  int  DEFAULT_HEIGHT = 500;

    public void paintComponent(Graphics2D g) {
        Graphics2D g2 = (Graphics2D) g;

        double leftX = 100;
        double topY = 200;
        double width = 200;
        double height = 150;

        Rectangle2D rect = new Rectangle2D.Double(leftX, topY, width, height);
        g2.draw(rect);
    }

    public Dimension getPreferedSize() {
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class FrameDemo extends JFrame {

    public FrameDemo() {
        add(new ComponentDemo());
        pack();
    }
}

public class ReactangleComponentDemo {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FrameDemo frame = new FrameDemo();
            frame.setTitle("Rectangle 2D Drawing");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
