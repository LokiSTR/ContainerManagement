package model.Gueter;

public class Tiere extends Gueter{

    String tierart;
    double gewicht;

    public Tiere(int gutnummer, String tierart, double gewicht) {
        super(gutnummer);
        setTierart(tierart);
        setGewicht(gewicht);
    }

    public String getGutTyp() {
       return "Dies ist ein " + getTierart() + ", es ist " + getGewicht() + "kg schwer.";
    }

    /**
     * 
     * SETTER UND GETTER
     */
    
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    public void setTierart(String tierart) {
        this.tierart = tierart;
    }
    public double getGewicht() {
        return gewicht;
    }
    public String getTierart() {
        return tierart;
    }
}
