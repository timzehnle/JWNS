package src;
import src.util.ShowInFrame;
import java.awt.Color;

public class PaintablePanel extends SizedPanel {
    Paintable pa;

    public PaintablePanel(Paintable pa) {
        this.pa = pa;
    }

    public void paintComponent(java.awt.Graphics g){
        pa.paintTo(g);
    }

    public static void main(String[] args) {
        ShowInFrame.show(new PaintablePanel(new PaintableOval(10, 5, 300, 500, new Color(125,3,4))));
        ShowInFrame.show(new PaintablePanel(new PaintableOval(1, 1, 130, 400)));
        ShowInFrame.show(new PaintablePanel(new PaintableRectangle(100, 200, 300, 500)));
        ShowInFrame.show(new PaintablePanel(new PaintableRectangle(100, 100, 130, 400)));
    }
}
