package model.Gueter;

public abstract class Gueter {
    
    int gutnummer;
    int bensicherheitslevel;
    double gewicht;

    public Gueter(int gutnummer, double gewicht){
        setGutnummer(gutnummer);
        setGewicht(gewicht);
    }

    public Gueter(int gutnummer, int bensicherheitslevel, double gewicht){
        setGutnummer(gutnummer);
        setBensicherheitslevel(bensicherheitslevel);
        setGewicht(gewicht);
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

    public int getGutnummer() {
        return gutnummer;
    }
    public int getBensicherheitslevel() {
        return bensicherheitslevel;
    }
    public double getGewicht() {
        return gewicht;
    }
}
