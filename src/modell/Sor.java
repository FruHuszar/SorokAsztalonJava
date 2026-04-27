package modell;

import java.util.Objects;

public class Sor {

    private double alkoholFok;
    private int mennyiseg;
    private SorTipus tipus;

    public Sor() {
        this(4.0, 500, SorTipus.VILAGOS);
    }

    public Sor(double alkoholFok, int mennyiseg, SorTipus tipus) {
        this.alkoholFok = alkoholFok;
        this.mennyiseg = mennyiseg;
        this.tipus = tipus;
    }

    public double getAlkoholFok() { return alkoholFok; }

    public int getMennyiseg() { return mennyiseg; }

    public SorTipus getTipus() { return tipus; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.alkoholFok) ^ (Double.doubleToLongBits(this.alkoholFok) >>> 32));
        hash = 23 * hash + this.mennyiseg;
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
        if (this.mennyiseg != other.mennyiseg) {
            return false;
        }
        return this.tipus == other.tipus;
    }

    @Override
    public String toString() {
        return "adatok: " + alkoholFok + "%, " + mennyiseg + "ml, " + tipus.getTipus();
    }
}