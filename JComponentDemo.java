import java.awt.*;
import javax.swing.*;


class ComponentDemo extends JComponent{
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 500;

    public void pointComponent (Graphics g) {
        g.drawString("Displaying Information in a component", 20, 20);
    }
    @Override
    public Dimension getPreferredSize(){
        return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }
}

class FrameDemo extends JFrame{
    public FrameDemo() {
        add(new ComponentDemo());
        pack();
    }
}


public class JComponentDemo {
    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            FrameDemo frame =  new FrameDemo();
            frame.setTitle("JComponent in JFrame");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        });
    }
}
