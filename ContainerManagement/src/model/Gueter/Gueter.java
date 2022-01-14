package model.Gueter;

public abstract class Gueter {
    
    int gutnummer;
    int bensicherheitslevel;
    double gewicht;
    String inhalt;

    public Gueter(int gutnummer, double gewicht, String inhalt){
        setGutnummer(gutnummer);
        setGewicht(gewicht);
        setInhalt(inhalt);
    }

    public Gueter(int gutnummer, int bensicherheitslevel, double gewicht, String inahlt){
        setGutnummer(gutnummer);
        setBensicherheitslevel(bensicherheitslevel);
        setGewicht(gewicht);
        setInhalt(inhalt);
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
}
