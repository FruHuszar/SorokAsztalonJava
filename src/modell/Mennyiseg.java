package modell;

public enum Mennyiseg {
    URES("üres"), 
    MAJDNEMURES("majdnem üres"), 
    FELIG("félig"), 
    MAJDNEMTELI("majdnem teli"), 
    TELI("teli");

    private final String mennyiseg;

    private Mennyiseg(String mennyiseg) {
        this.mennyiseg = mennyiseg;
    }

    public String getMennyiseg() {
        return mennyiseg;
    }
}