package model.Gueter;

public class Wertgegenstaende extends Gueter{

    double wert;

    public Wertgegenstaende(int gutnummer, int bensicherheitslevel, double wert) {
        super(gutnummer, bensicherheitslevel);
        setWert(wert);
    }

    public String getGutTyp() {
        return "Die Güternummer ist: " + getGutnummer() + ". Das gut ist ein Wertgegenstand mit einem Gegenwert von " + getWert() + "$: Deshalb benötigt es das Sicherheitslevel " + getBensicherheitslevel() + ", es ist " + getGewicht() + "kg schwer.";
    }


    /**
     * 
     * SETTER UND GETTER
     */
    
    public void setWert(double wert) {
        this.wert = wert;
    }
    public double getWert() {
        return wert;
    }
}