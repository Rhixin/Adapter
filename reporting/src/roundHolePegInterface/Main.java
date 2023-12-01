package roundHolePegInterface;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        System.out.println(hole.fits(rpeg));

        SquarePeg small_speg = new SquarePeg(5);
        SquarePeg large_speg = new SquarePeg(10);

        //ERRRORRR
        //System.out.println(hole.fits(small_speg));

        RoundThings small_sqpeg_adapter = new SquarePegAdapter(small_speg);
        RoundThings large_sqpeg_adapter = new SquarePegAdapter(large_speg);

        System.out.println(hole.fits(small_sqpeg_adapter));
        System.out.println(hole.fits(large_sqpeg_adapter));
    }
}
