package Elementals;


public class PostTransitionMetal extends Element{
    public PostTransitionMetal(int atomicNumber, String elemSym, String name, double atomicWeight, double meltingPoint, double boilingPoint) {
        super(atomicNumber, elemSym, name, atomicWeight, meltingPoint, boilingPoint);
    }

    public static class Tin extends PostTransitionMetal{
        public Tin(int atomicNumber, String elemSym, String name, double atomicWeight, double meltingPoint, double boilingPoint) {
            super(50 , "Sn", "Tin", 118.7, 231.9, 2602);
        }
    }

    public static class Aluminum extends PostTransitionMetal implements Conductive{
        public Aluminum() {
            super(13 , "Al", "Aluminum", 27, 660.3, 2470);
        }

        @Override
        public double percent_conductive() {
            double percent = 0.61 * 100;
            return percent ;
        }
    }



}