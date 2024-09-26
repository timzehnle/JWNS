package src;

public class SimpleSquare extends GeometricObject {
    public SimpleSquare(Vertex pos, double width){
        super(pos, width);
    }

    public String toString() {
        return "SimpleSquare: " + super.toString();
    }
}