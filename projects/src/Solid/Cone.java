package Solid;

public class Cone extends Solid{
    double base_dia;
    double height;

    public Cone(int x, int y, double base_dia, double height) {
        super(x, y);
        this.base_dia = base_dia;
        this.height = height;
    }

    public Cone(double base_dia, double height) {
        super();
        this.base_dia = base_dia;
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + " which is a Cone";
    }
    @Override
    public double volume() {
        return (1.0/3) * Math.PI * ((base_dia/2) * (base_dia/2)) * height;
    }
    @Override
    public double surfaceArea() {
        return Math.PI * (base_dia/2) * (Math.sqrt(((base_dia/2)*(base_dia/2))+(height*height)) + (base_dia/2));
    }
}