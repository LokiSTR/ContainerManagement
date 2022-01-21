package model.Gueter;

public class Wertgegenstaende extends Gueter{

    double wert;

    public Wertgegenstaende(int sicherheitslevel, double gewicht, String inhalt, double wert) {
        super( sicherheitslevel, gewicht, inhalt);
        setWert(wert);
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
