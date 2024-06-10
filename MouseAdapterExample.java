import java.awt.event.*;
import javax.swing.*;

public class MouseAdapterExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Adapter Example");
        JLabel label = new JLabel("Click anywhere inside the frame");
        
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at X: " + e.getX() + " - Y: " + e.getY());
            }
        });

        frame.add(label);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
