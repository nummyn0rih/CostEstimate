import javax.swing.*;
import java.awt.*;

public class Frame {

    public void setFrame() {

        JFrame frame = new JFrame();

        //frame.getContentPane().add(BorderLayout.EAST, east);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 600);
        frame.setVisible(true);
    }
}
