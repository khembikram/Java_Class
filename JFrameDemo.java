import javax.swing.SwingUtilities;

import java.awt.Color;

import javax.swing.*;
public class JFrameDemo {
    public static void main (String[] args){
        SwingUtilities.invokeLater(()->{
            SimpleFrame frame = new SimpleFrame();
            frame.setTitle("Demo Demo Demo");
            JButton button = new JButton("Click Me!");
            button.setBackground(Color.BLUE);
            button.setForeground(Color.WHITE);
            button.addActionListener(e->{
                JOptionPane.showMessageDialog(frame, "Hi", "Message", JOptionPane.INFORMATION_MESSAGE);
            });
            frame.getContentPane().add(button);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
