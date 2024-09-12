package src;

class Vertex{
    public double x;
    public double y;
    public static int i;
    public static int j;

    public Vertex(double x, double y){
        this.x=x;
        this.y=y;
        
    }       
        public static void main(String[] args){
            Vertex v1 = new Vertex(42, 17);
            Vertex v2 = new Vertex(0.3, 24.6);
            Vertex v3 = v1.skalarMult(2);

            System.out.println(v1);
            System.out.println(v3);
            System.out.println(v1.lenght());
            System.out.println(v2.lenght());

            
        }

        public Vertex skalarMult(double s){
            return new Vertex(x*s,y*s);
        }

        public void skalarMultMod (double s){
            x=x*s; 
            y=y*s;
        }

        public double lenght(){
            return Math.sqrt(x*x+y*y);
        }
    
        public String toString() {
            return "("+x+","+y+")";
    }
  
}