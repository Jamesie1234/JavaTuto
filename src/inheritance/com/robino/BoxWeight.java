package inheritance.com.robino;

public class BoxWeight extends Box{
    public double weight;


    public BoxWeight (double w, double h, double d, double m) {
        this.width = w;
         this.height = h;
         this.depth = d;
         this.weight = m;
    }
    public BoxWeight(Box b, double w) {
        //Box(b);
        b = new Box();
        weight = w;
    }

    public BoxWeight(BoxWeight bw) {
        //Box(b);
        System.out.println(bw.toString());
        //bw = new BoxWeight(bw.width,bw.height,bw.depth, bw.weight );
    }
}
