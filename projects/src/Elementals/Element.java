package Elementals;


public class Element implements Comparable<Element>{
    double meltingPoint;
    double boilingPoint;
    int atomicNumber;
    String elemSym;
    String name;
    double atomicWeight;



    public Element(int atomicNumber, String elemSym, String name, double atomicWeight, double meltingPoint, double boilingPoint) {
        this.atomicNumber = atomicNumber;
        this.elemSym = elemSym;
        this.name = name;
        this.atomicWeight = atomicWeight;
        this.meltingPoint = meltingPoint;
        this.boilingPoint = boilingPoint;

    }

//    public int getAtomicNumber() {
//        return atomicNumber;
//    }
//
//    public String getElemSym() {
//        return elemSym;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getAtomicWeight() {
//        return atomicWeight;
//    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public String getElemSym() {
        return elemSym;
    }

    public String getName() {
        return name;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    @Override
    public int compareTo(Element o) {
        int a = Double.compare(this.atomicWeight, o.atomicWeight);

        if(a == 0){
            return Integer.compare(this.atomicNumber, o.atomicNumber);
        }

        return a;
    }
}
