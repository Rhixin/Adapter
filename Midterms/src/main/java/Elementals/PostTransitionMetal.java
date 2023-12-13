package Elementals;

public abstract class PostTransitionMetal extends Element{
    public PostTransitionMetal(int atomicNumber, String elemSym, String name, double atomicWeight, double meltingPoint, double boilingPoint) {
        super(atomicNumber, elemSym, name, atomicWeight, meltingPoint, boilingPoint);
    }

    public static class Tin extends PostTransitionMetal{
        public Tin() {
            super(50 , "Sn", "Tin", 118.7, 231.9, 2602);
        }


        @Override
        public int state(float temp) {
            if(meltingPoint > temp){
                return 1;
            } else if (meltingPoint < temp && temp < boilingPoint){
                return 2;
            }

            return 3;
        }
    }

    public static class Aluminum extends PostTransitionMetal implements Conductive{
        public Aluminum() {
            super(13 , "Al", "Aluminum", 27, 660.3, 2470);
        }

        @Override
        public double percent_conductive() {
            return 0.61 * 100;
        }

        @Override
        public int state(float temp) {
            if(meltingPoint > temp){
                return 1;
            } else if (meltingPoint < temp && temp < boilingPoint){
                return 2;
            }

            return 3;
        }
    }



}
