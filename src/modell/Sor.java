package modell;

import java.util.Objects;

public class Sor {

    private double alkoholFok;
    private Mennyiseg mennyiseg;
    private SorTipus tipus;

    public Sor() {
        this(4.0, Mennyiseg.TELI, SorTipus.VILAGOS);
    }

    public Sor(double alkoholFok, Mennyiseg mennyiseg, SorTipus tipus) {
        setAlkoholFok(alkoholFok);
        setMennyiseg(mennyiseg);
        this.tipus = tipus;
    }
    
    /**
     * valuessal le lehet kérdezni az enum elemeit,
     * ordinallal az aktuális indexét.
     */
    public void ivas() {
        Mennyiseg[] m = Mennyiseg.values();
        int index = this.mennyiseg.ordinal();

        if (index > 0) {
            setMennyiseg(m[index - 1]);
        }
    }
    
    private void setMennyiseg(Mennyiseg mennyiseg){
        this.mennyiseg = mennyiseg;
    }
    
    private void setAlkoholFok(double alkoholFok){
        this.alkoholFok = alkoholFok < 0.0 ? 0.0 : alkoholFok;
    }

    public double getAlkoholFok() { return alkoholFok; }

    public Mennyiseg getMennyiseg() { return mennyiseg; }

    public SorTipus getTipus() { return tipus; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.alkoholFok) ^ (Double.doubleToLongBits(this.alkoholFok) >>> 32));
        hash = 23 * hash + Objects.hashCode(this.tipus);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sor other = (Sor) obj;
        if (Double.doubleToLongBits(this.alkoholFok) != Double.doubleToLongBits(other.alkoholFok)) {
            return false;
        }
        return this.tipus == other.tipus;
    }

    @Override
    public String toString() {
        return "adatok: " + alkoholFok + "%, " + mennyiseg + "ml, " + tipus.getTipus();
    }
}