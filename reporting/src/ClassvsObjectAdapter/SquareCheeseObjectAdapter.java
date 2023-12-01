package ClassvsObjectAdapter;

//OBJECT APPROACH

public class SquareCheeseObjectAdapter implements RoundThings{
    private SquareCheese cheese;

    public SquareCheeseObjectAdapter(SquareCheese cheese){
        this.cheese = cheese;
    }

    @Override
    public int getRadius() {
        return (int) (cheese.getWidth() *  Math.sqrt(2) / 2);
    }
}
