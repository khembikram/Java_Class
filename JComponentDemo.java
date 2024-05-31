import javax.swing.*;
import java.awt.*;


class ComponentDemo extends JComponent{
    private static final int DEFAULT_WIDTH = 500;
    private static final int DEFAULT_HEIGHT = 500;

    public void pointComponent (Graphics g) {
        g.drawString("Displaying Information in a component", 20, 20);
    }
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
    
}
