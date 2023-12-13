package Solid;

public abstract class Solid {
    int x;
    int y;
    public Solid(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public Solid() {
        this.x = 50;
        this.y = 50;
    }

    @Override
    public String toString() {
        return "A solid at (" + x + ", " + y + ")";
    }

    public abstract double volume();
    public abstract double surfaceArea();
}
