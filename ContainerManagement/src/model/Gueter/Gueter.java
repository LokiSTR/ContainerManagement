package model.Gueter;

public abstract class Gueter {
    
    int gutnummer;
    int bensicherheitslevel;
    double gewicht;
    String inhalt;
    static int anzahlGueter;

    public Gueter(double gewicht, String inhalt){
        setGewicht(gewicht);
        setInhalt(inhalt);
        //Generator Gutnummer
        anzahlGueter ++;
        setGutnummer(anzahlGueter);

    }

    public Gueter(int bensicherheitslevel, double gewicht, String inahlt){
        setBensicherheitslevel(bensicherheitslevel);
        setGewicht(gewicht);
        setInhalt(inhalt);
        //Generator Gutnummer
        anzahlGueter ++;
        setGutnummer(anzahlGueter);
    }


    /**
     * 
     * SETTER UND GETTER
     */

    public void setGutnummer(int gutnummer) {
        this.gutnummer = gutnummer;
    }
    public void setBensicherheitslevel(int bensicherheitslevel) {
        this.bensicherheitslevel = bensicherheitslevel;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public int getGutnummer() {
        return gutnummer;
    }
    public int getBensicherheitslevel() {
        return bensicherheitslevel;
    }
    public double getGewicht() {
        return gewicht;
    }
    public String getInhalt() {
        return inhalt;
    }
    public static void setAnzahlGueter(int anzahlGueter) {
        Gueter.anzahlGueter = anzahlGueter;
    }
    public static int getAnzahlGueter() {
        return anzahlGueter;
    }
}
