package Elementals;

import java.util.ArrayList;
import java.util.List;

public abstract class Alloy{
    public String name;
    public ArrayList<Element> array_of_elements;

    public Alloy(String name, ArrayList<Element> array_of_elements) {
        this.name = name;
        this.array_of_elements = array_of_elements;
    }

    @Override
    public String toString() {
        return name;
    }

    public static class Steel extends Alloy implements Magnetize{
        public Steel() {
            super("Steel", new ArrayList<>(List.of(new TransitionMetal.Iron(), new TransitionMetal.Copper())));
        }

        @Override
        public int magnetic_strength() {
            return 1950;
        }

        @Override
        public int magnetic_type() {
            return 1;
        }

    }

    public static class Bronze extends Alloy {
        public Bronze() {
            super("Bronze", new ArrayList<>(List.of(new PostTransitionMetal.Tin(), new TransitionMetal.Copper())));
        }


    }

    public static class Brass extends Alloy implements Conductive{
        public Brass() {
            super("Brass", new ArrayList<>(List.of(new TransitionMetal.Copper(), new TransitionMetal.Zinc())));
        }

        @Override
        public double percent_conductive() {
            return 0.28 * 100;
        }


    }

}


