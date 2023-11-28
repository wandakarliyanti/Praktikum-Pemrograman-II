package soal1;

public class Sphere extends Shape{
    private double radius;

    public Sphere (Double r){
        super("soal1.Sphere");
        this.radius=r;
    }

    public double area(){
        return 4*Math.PI*(radius*radius);
    }

    public String toString(){
        return super.toString() + " of radius " + radius;
    }
}