package src;
import java.awt.Color;

public class SimpleRectangle extends GeometricObject {
    public SimpleRectangle(Vertex pos, double width, double height, Color color){
        super(pos, width, height, color);
    }

    public String toString() {
        return "SimpleRectangle: " + super.toString();
    }
}
