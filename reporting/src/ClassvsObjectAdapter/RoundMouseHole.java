package ClassvsObjectAdapter;

public class RoundMouseHole{
    private int radius;

    public RoundMouseHole(int radius){

        this.radius = radius;
    }

    public boolean fits(RoundThings peg){

        return (radius >= peg.getRadius());
    }

    public int getRadius() {
        return radius;
    }
}
