import javax.swing.SwingUtilities;
import javax.swing.*;
public class JFrameDemo {
    public static void main (String[] args){
        SwingUtilities.invokeLater(()->{
            SimpleFrame frame = new SimpleFrame();
            frame.setTitle("Demo Demo Demo");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
