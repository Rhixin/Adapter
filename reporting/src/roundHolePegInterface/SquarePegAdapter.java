package roundHolePegInterface;

public class SquarePegAdapter implements RoundThings{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        this.peg = peg;
    }

    @Override
    public int getRadius() {
        return (int) (peg.getWidth() *  Math.sqrt(2) / 2);
    }
}
