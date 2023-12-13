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

                    break;
                case "Zinc":
                    elements.add(new TransitionMetal.Zinc());
                    break;
                case "Tin":
                    break;
                case "Technetium":
// UNCOMMENT these when you want to solve the problem already
                    elements.add(new TransitionMetal.Technetium());
                    break;
                case "Uranium":
// UNCOMMENT these when you want to solve the problem already
                    elements.add(new Actinide.Uranium());
                    break;



// TODO add more cases here
            }
        } while (!input.equals("DONE"));

        do {
            System.out.print("Enter action: ");
            input = sc.nextLine();
            switch (input){
                case "Radiate":
                    for(Element e: elements ){
                        if (e instanceof Radioactive){
                            System.out.println(e.atomicNumber +" "+ e.name + " (" + e.elemSym+") emitting radiation " );
                            System.out.println(e.atomicNumber +" "+ e.name + " (" + e.elemSym+")'s half-life: "+ ((Radioactive) e).half_life());
                        }
                    }
                    break;
                case "Magnetize":
// TODO Magnetize here
                    break;
                case "Conduct":
                    for(Element e: elements ){
                        if (e instanceof Conductive){
                            System.out.printf(e.atomicNumber +" "+ e.name + " (" + e.elemSym+") conductivity is "+ "%.1f", ((Conductive) e).percent_conductive() );
                            System.out.print("%");
                            System.out.println();
                        }else{
                            System.out.println("No conductive materials present");
                        }
                    }
// TODO Conduct here
                    break;
                case "Alloy Components":
// TODO Alloy Components here
                    break;
                case "Get State":
                    System.out.print("Enter temperature: ");
                    double temp = sc.nextDouble();
                    sc.nextLine(); // This is to clear the newline
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