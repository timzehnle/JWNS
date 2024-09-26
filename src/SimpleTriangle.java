package src;

public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle(Vertex pos, double width, double height){
        super (pos, width, Math.sqrt(3) / 2*width);
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