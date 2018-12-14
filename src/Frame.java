import javax.swing.*;
import java.awt.*;

public class Frame {

    public void setFrame() {

        JFrame frame = new JFrame();
        JPanel east = new JPanel();
        JPanel west = new JPanel();
        JPanel north = new JPanel();
        JPanel south = new JPanel();
        JPanel center = new JPanel();

        frame.getContentPane().add(BorderLayout.EAST, east);
        frame.getContentPane().add(BorderLayout.WEST, west);
        frame.getContentPane().add(BorderLayout.NORTH, north);
        frame.getContentPane().add(BorderLayout.SOUTH, south);
        frame.getContentPane().add(BorderLayout.CENTER, center);

        east.setBackground(Color.cyan);
        west.setBackground(Color.gray);
        north.setBackground(Color.black);
        south.setBackground(Color.green);
        center.setBackground(Color.orange);

        JButton buttonToCalculate = new JButton("Рассчитать");
        south.add(buttonToCalculate);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 600);
        frame.setVisible(true);
    }
}
