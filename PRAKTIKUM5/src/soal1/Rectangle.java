package soal1;

public class Rectangle extends Shape {
    private double length, width;

    public Rectangle (Double l, Double w){
        super("soal1.Sphere");
        this.length=l;
        this.width=w;
    }

    public double area(){
        return length*width;
    }

    public String toString(){
        return super.toString() + " of length " + length + " and width " + width;
    }
}
