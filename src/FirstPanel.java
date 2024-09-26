package src;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FirstPanel extends JPanel {
    public void paintComponent(java.awt.Graphics g){
        g.fillRect(50, 50, 200, 200);
        g.fillOval(300, 50, 150, 200);
        g.fillRoundRect(500, 50, 200, 200, 50, 50);
    }

    public static void main(String[] args){
        JFrame f = new JFrame();
        f.add(new FirstPanel());
        f.pack();
        f.setVisible(true);
    }
}