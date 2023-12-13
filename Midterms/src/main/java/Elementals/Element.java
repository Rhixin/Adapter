package Elementals;
// Also put Actinide and Uranium as inner class here

public abstract class Element implements Comparable<Element> {
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
        return Double.compare(atomicWeight, o.atomicWeight);
    }

    @Override
    public String toString() {
        return (atomicNumber + " " + name + " (" + elemSym + ")");
    }

    public abstract int state(float temp);
}
