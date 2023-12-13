package Elementals;

public abstract class TransitionMetal extends Element{

    public TransitionMetal(int atomicNumber, String elemSym, String name, double atomicWeight, double meltingPoint, double boilingPoint) {
        super(atomicNumber, elemSym, name, atomicWeight, meltingPoint, boilingPoint);
    }

    public static class Iron extends TransitionMetal implements Magnetize{

        public Iron() {
            super(26, "Fe", "Iron", 55.8, 1538 , 2862);
        }

        @Override
        public int magnetic_strength() {
            return 1710;
        }

        @Override
        public int magnetic_type() {
            return 1;
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

    public static class Gold extends TransitionMetal implements Conductive{

        public Gold() {
            super(79 , "Au", "Gold", 197, 1064, 2970);
        }

        @Override
        public double percent_conductive() {
            return 0.7 * 100;
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

    public static class Titanium extends TransitionMetal{

        public Titanium() {
            super(22 , "Ti", "Titanium", 47.9, 1668, 3287);
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

    public static class Zinc extends TransitionMetal implements Conductive{

        public Zinc() {
            super(30 , "Zn", "Zinc", 65.4, 419.5, 907.0);
        }

        @Override
        public double percent_conductive() {
            return 0.27 * 100;
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


    public static class Technetium extends TransitionMetal implements Radioactive, Conductive,Magnetize{

        public Technetium() {
            super(43 , "Tc", "Technetium", 98, 2157, 4265);
        }

        @Override
        public int half_life() {
            return 61;
        }

        @Override
        public int magnetic_strength() {
            return 270;
        }

        @Override
        public int magnetic_type() {
            return 2;
        }

        @Override
        public double percent_conductive() {
            return 0.65 * 100;
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

    public static class Copper extends Element {

        public Copper() {
            super(29, "Cu", "Copper", 63.5, 1085, 2562);
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