package roundHolePegInterface;


public class RoundHole implements RoundThings{
    private int radius;

    public RoundHole(int radius){
        this.radius = radius;
    }

    public boolean fits(RoundThings peg){
        return (radius >= peg.getRadius());
    }

    @Override
    public int getRadius() {
        return radius;
    }
}
