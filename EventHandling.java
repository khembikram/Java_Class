import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class EventHandling {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(EventHandleBtn::new);
    }
}

class EventHandleBtn extends JFrame {
    private JPanel panel;
    private static final int DEFAULT_HEIGHT = 500;
    private static final int DEFAULT_WIDTH = 500;

    public EventHandleBtn() {
        initializeFrame();
        addEventButton("Click Me!");
    }

    public void initializeFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        panel = new JPanel();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addEventButton(String text) {
        JButton button = new JButton(text);
        button.addActionListener(new EventAction());
        panel.add(button);
    }

    public static class EventAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, "You Clicked Me!!");
        }
    }
}
