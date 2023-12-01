package roundHolePegInterface;

public class RoundPeg implements RoundThings{
    private int radius;

    public RoundPeg(int radius){
        this.radius = radius;
    }
    @Override
    public int getRadius() {
        return radius;
    }

}
