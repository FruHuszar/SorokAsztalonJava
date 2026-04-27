package main;

import modell.Sor;
import modell.Asztal;
import modell.SorTipus;

public class Program {
    public static void main(String[] args) {
        Asztal asztal = new Asztal();
        
        asztal.sorHozzaad(new Sor(5.2, 500, SorTipus.BARNA));  
        asztal.sorHozzaad(new Sor(7.0, 330, SorTipus.MEGGY)); 
        asztal.sorHozzaad(new Sor());               

        System.out.println(asztal.toString());
    }
}