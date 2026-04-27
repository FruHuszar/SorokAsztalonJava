package modell;

import java.util.Arrays;

public class Asztal {
    private final Sor[] sorok;
    private int db; 

    public Asztal() {
        this.sorok = new Sor[4];
        this.db = 0;
    }

    public void sorHozzaad(Sor sor) {
        if (db < sorok.length) {
            sorok[db++] = sor;
        }
    }

    public Sor[] getSorok() { return sorok; }

    public int getDb() { return db; }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Arrays.deepHashCode(this.sorok);
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
        final Asztal other = (Asztal) obj;
        return Arrays.deepEquals(this.sorok, other.sorok);
    }

    @Override
    public String toString() {
       
        String s = "Asztal\n";
        s += "|" + (db > 0 ? "o" : " ") + " " + (db > 1 ? "o" : " ") + "|\n";
        s += "|" + (db > 2 ? "o" : " ") + " " + (db > 3 ? "o" : " ") + "|\n";
        
        s += "__________________\nSörök az asztalon:\n";
        for (int i = 0; i < db; i++) {
            s += sorok[i].toString() + "\n";
        }
        return s;
    }
}