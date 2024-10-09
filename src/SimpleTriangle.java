package src;
import java.awt.Color;

public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle(Vertex pos, double width, double height, Color color){
        super (pos, width, Math.sqrt(3) / 2*width, color);
    }

    public double area(){
        return 1/2 * width * height;
    }

    public double circumference(){
        return 3*width;
    }

    public String toString() {
        return "SimpleTriangle: " + super.toString();
    }
}