package src;

public class SimpleRectangle extends GeometricObject {
    public SimpleRectangle(Vertex pos, double width, double height){
        super(pos, width, height);
    }

    public String toString() {
        return "SimpleRectangle: " + super.toString();
    }
}
