package src;

public class SimpleOval extends GeometricObject {
    
    public SimpleOval(Vertex pos, double width, double height){
        super(pos, width, height);
    }

    public SimpleOval(double posx, double posy, double width, double height){
        super(posx, posy, width, height);
    }


    public String toString() {
        return "SimpleOval: " + super.toString();
    }
}
