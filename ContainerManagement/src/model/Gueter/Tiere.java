package model.Gueter;

public class Tiere extends Gueter{

    String tierart;

    public Tiere(int gutnummer, double gewicht, String inhalt, String tierart) {
        super(gutnummer, gewicht, inhalt);
        setTierart(tierart);
    }


    /**
     * 
     * SETTER UND GETTER
     */
    
    
    public void setTierart(String tierart) {
        this.tierart = tierart;
    }
    
    public String getTierart() {
        return tierart;
    }
}
