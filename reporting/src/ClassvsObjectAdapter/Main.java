package ClassvsObjectAdapter;

public class Main {
    public static void main(String[] args) {
        RoundMouseHole cheese_hole = new RoundMouseHole(5);
        CircleCheese circle_cheese = new CircleCheese(5);

        //Try Circle Cheese fit to Hole
        System.out.println("Normal Circle cheese: " + cheese_hole.fits(circle_cheese));

        SquareCheese small_square_cheese = new SquareCheese(5);
        SquareCheese large_square_cheese = new SquareCheese(10);

        //ERROR (can't fit a square cheese to a cheese_hole directly)---------------
        //System.out.println(cheese_hole.fits(small_square_cheese));
        //System.out.println(cheese_hole.fits(large_square_cheese));
        //--------------------------------------------------------------------------


        //OBJECT ADAPTER APPROACH --------------------------------------------------------------------------
        RoundThings object_small_cheese_adapter = new SquareCheeseObjectAdapter(small_square_cheese);
        RoundThings object_large_cheese_adapter = new SquareCheeseObjectAdapter(large_square_cheese);

        System.out.println("Object Adapter Cheese (small): " + cheese_hole.fits(object_small_cheese_adapter));
        System.out.println("Object Adapter Cheese (large): " + cheese_hole.fits(object_large_cheese_adapter));
        //---------------------------------------------------------------------------------------------------


        //CLASS ADAPTER APPROACH ----------------------------------------------------------------------------
        RoundThings class_small_cheese_adapter = new SquareCheeseClassAdapter(small_square_cheese.getWidth());
        RoundThings class_large_cheese_adapter = new SquareCheeseClassAdapter(large_square_cheese.getWidth());

        System.out.println("Class Adapter Cheese (small): " + cheese_hole.fits(class_small_cheese_adapter));
        System.out.println("Class Adapter Cheese (large): " + cheese_hole.fits(class_large_cheese_adapter));
        //---------------------------------------------------------------------------------------------------
    }
}

