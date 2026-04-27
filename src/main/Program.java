package main;

import modell.Sor;
import modell.Asztal;
import modell.Mennyiseg;
import modell.SorTipus;

public class Program {
    public static void main(String[] args) {
        Asztal asztal = new Asztal();
        
        asztal.sorHozzaad(new Sor(-2, Mennyiseg.FELIG, SorTipus.BARNA));  
        asztal.sorHozzaad(new Sor(7.0, Mennyiseg.MAJDNEMURES, SorTipus.MEGGY)); 
        asztal.sorHozzaad(new Sor());               

        System.out.println(asztal.toString());
        
        Sor s = new Sor(4.0, Mennyiseg.TELI, SorTipus.MEGGY);
        s.ivas();
        System.out.println(s.toString());
        s.ivas();
        System.out.println(s.toString());
        s.ivas();
        System.out.println(s.toString());
        s.ivas();
        System.out.println(s.toString());
    }
}