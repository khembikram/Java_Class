import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class WordCounter {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            AdapterFrame frame = new AdapterFrame();
            frame.setTitle("Adapter Demo");
            frame.setSize(300, 300);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}

class AdapterFrame extends JFrame {
    JPanel displayPanel;
    JTextField text;
    JLabel mouseLabel;
    JLabel keyLabel;

    AdapterFrame() {
        displayPanel = new JPanel();
        text = new JTextField(10);
        mouseLabel = new JLabel("Mouse Event");
        keyLabel = new JLabel();

        displayPanel.add(mouseLabel);
        displayPanel.add(keyLabel);
        add(text, BorderLayout.NORTH);
        add(displayPanel, BorderLayout.SOUTH);

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent me) {
                Graphics g = getGraphics();
                g.setColor(Color.RED);
                g.fillOval(me.getX(), me.getY(), 20, 20);
                mouseLabel.setText("Clicked at :" + me.getX() + "," + me.getY());
            }
        });

        text.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent ke) {

                String[] words = text.getText().split("\\s");
                keyLabel.setText("No of words " + words.length);
                // char c = ke.getKeyChar();
                // keyLabel.setText(text.getText() + c);
            }
        });
    }
}