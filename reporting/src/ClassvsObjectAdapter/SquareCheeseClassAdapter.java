package ClassvsObjectAdapter;

//CLASS APPROACH

public class SquareCheeseClassAdapter extends SquareCheese implements RoundThings{
    public SquareCheeseClassAdapter(int width){
        super(width);
    }

    @Override
    public int getRadius() {
        return (int) (getWidth() *  Math.sqrt(2) / 2);
    }
}
