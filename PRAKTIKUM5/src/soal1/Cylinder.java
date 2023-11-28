package soal1;

public class Cylinder extends Shape {
    private double radius, height;

    public Cylinder (double r, double h){
        super("soal1.Sphere");
        this.radius=r;
        this.height=h;
    }

    public double area(){
        return Math.PI*(radius*radius)*height;
    }

    public String toString(){
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
