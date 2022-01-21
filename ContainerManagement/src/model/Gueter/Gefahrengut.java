package model.Gueter;

public class Gefahrengut extends Gueter{
    
    String inhalt;
    
    public Gefahrengut(int sicherheitslevel, String inhalt) {
        super(sicherheitslevel, inhalt);
        setInhalt(inhalt);
    }


    /**
     * 
     * SETTER UND GETTER
     */
    public void setsicherheitslevel(int sicherheitslevel) {
        this.sicherheitslevel = sicherheitslevel;
    }
    public int getSicherheitslevel() {
        return sicherheitslevel;
    }
    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }
    public String getInhalt() {
        return inhalt;
    }
}
