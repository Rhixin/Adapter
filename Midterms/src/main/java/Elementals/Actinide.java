package Elementals;

public abstract class Actinide extends Element {

    public Actinide(int atomicNumber, String elemSym, String name, float atomicWeight, float meltingPoint, int boilingPoint) {
        super(atomicNumber, elemSym, name, atomicWeight, meltingPoint, boilingPoint);
    }

    public static class Uranium extends TransitionMetal implements Radioactive {

        public Uranium() {
            super(92, "U", "Uranium", 238, 1132.2, 4131);
        }

        @Override
        public int half_life() {
            return 25166;
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
