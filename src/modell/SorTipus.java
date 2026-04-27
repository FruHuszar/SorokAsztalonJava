package modell;

public enum SorTipus {
    VILAGOS("világos"), 
    BARNA("barna"), 
    BUZA("búza"), 
    IPA("IPA"), 
    MEGGY("meggy");

    private final String tipus;

    private SorTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getTipus() {
        return tipus;
    }
}