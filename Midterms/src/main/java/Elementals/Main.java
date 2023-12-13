package Elementals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Element> elements = new ArrayList<>();
        List<Alloy> alloys = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        do {
            System.out.print("Enter element/alloy: ");
            input = sc.nextLine();
            switch (input) {
                case "Gold":
// UNCOMMENT these when you want to solve the problem already
                    elements.add(new TransitionMetal.Gold());
                    break;
                case "Aluminum":
                    elements.add(new PostTransitionMetal.Aluminum());
                    break;
                case "Titanium":
                    elements.add(new TransitionMetal.Titanium());
                    break;
                case "Zinc":
                    elements.add(new TransitionMetal.Zinc());
                    break;
                case "Tin":
                    elements.add(new PostTransitionMetal.Tin());
                    break;
                case "Technetium":
// UNCOMMENT these when you want to solve the problem already
                    elements.add(new TransitionMetal.Technetium());
                    break;
                case "Uranium":
// UNCOMMENT these when you want to solve the problem already
                    elements.add(new Actinide.Uranium());
                    break;
                case "Steel":
                    alloys.add(new Alloy.Steel());
                    break;
                case "Brass":
                    alloys.add(new Alloy.Brass());
                    break;
                case "Bronze":
                    alloys.add(new Alloy.Bronze());
                    break;
                case "Copper":
                    elements.add(new TransitionMetal.Copper());
                    break;


// TODO add more cases here
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input){
                case "Radiate":
                    int radi = 0;
                    for(Element e: elements ){
                        if (e instanceof Radioactive){
                            radi = 1;
                            System.out.println(e.atomicNumber +" "+ e.name + " (" + e.elemSym+") emitting radiation " );
                            System.out.println(e.atomicNumber +" "+ e.name + " (" + e.elemSym+")'s half-life: "+ ((Radioactive) e).half_life());
                        }
                    }

                    if(radi == 0){
                        System.out.println("No radioactive materials present");
                    }
                    break;
                case "Magnetize":
// TODO Magnetize here
                    String mag;
                    int m = 0;
                    for(Element e : elements){
                        if(e instanceof Magnetize){
                            if(((Magnetize) e).magnetic_type() == 1){
                                mag = "ferromagnetic";
                            } else {
                                mag = "paramagnetic";

                            }
                            m = 1;
                            System.out.println(e.atomicNumber + " " + e.name + " (" + e.elemSym + ") is " + mag + " with strength of " + ((Magnetize) e).magnetic_strength());
                        }
                    }

                    for(Alloy a : alloys){
                        if(a instanceof Magnetize){
                            if(((Magnetize) a).magnetic_type() == 1){
                                mag = "ferromagnetic";
                            } else {
                                mag = "paramagnetic";
                            }
                            m = 1;

                            System.out.println(a + " is " + mag + " with strength of " + ((Magnetize) a).magnetic_strength());

                        }
                    }

                    if(m == 0){
                        System.out.println("No magnetic materials present");
                    }


                    break;
                case "Conduct":
                    int c = 0;
                    for(Element e: elements ){
                        if (e instanceof Conductive){
                            System.out.printf(e.atomicNumber +" "+ e.name + " (" + e.elemSym+") conductivity is "+ "%.1f", ((Conductive) e).percent_conductive() );
                            System.out.print("%");
                            System.out.println();
                            c = 1;
                        }
                    }

                    if(c == 0){
                        System.out.println("No conductive materials present");
                    }
// TODO Conduct here
                    break;
                case "Alloy Components":
// TODO Alloy Components here
                    int comp = 0;
                    for(Alloy e : alloys){
                        comp = 1;
                        System.out.println(e.name + " consists of " + e.array_of_elements.get(0).name + ", " + e.array_of_elements.get(1).name);

                    }

                    if(comp == 0){
                        System.out.println("No alloys present");
                    }
                    break;
                case "Get State":
                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();
                    sc.nextLine(); // This is to clear the newline
                    int r;

                    for(Element e : elements){
                            r = e.state((float)temp);

                            System.out.print(e);
                            System.out.print(" is ");
                            if(r == 1){
                                System.out.println("solid");
                            } else if ( r == 2){
                                System.out.println("liquid");
                            }   else {
                                System.out.println("gas");
                            }

                    }

                    
                    if (elements.isEmpty()) {
                        System.out.println("No elements present");
                    }

// TODO print state of elements
                    break;
                case "Sort by Weight":
// UNCOMMENT these when you want to solve the problem already

                    Collections.sort(elements);
                    for (Element e : elements) {
                        System.out.println(e + " = " + e.getAtomicWeight());
                    }
                    if (elements.isEmpty()) {
                        System.out.println("No elements present");
                    }

                    break;
            }
        } while (!input.equals("DONE"));
    }
}
