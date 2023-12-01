package ClassvsObjectAdapter;

public class CircleCheese implements RoundThings {
    private int radius;

    public CircleCheese(int radius){

        this.radius = radius;
    }
    @Override
    public int getRadius() {
        return radius;
    }
}