package inheritance.com.robino;

public class Box {
   public  double width, height, depth;

    public Box (){};

    public Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    public Box(Box b) {
        this.width = b.width;
        this.height = b.height;
        this.depth = b.depth;
    }
    public double volume() {
        return width * height * depth;
    }
}
