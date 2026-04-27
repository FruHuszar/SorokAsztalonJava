# SorokAsztalonJava

- Added: enum a sortípushoz. - Otthon
- Added: enum a mennyiséghez. - Órán

```Java
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
```
