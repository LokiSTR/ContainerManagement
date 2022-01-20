package model.Gueter;

public class Gefahrengut extends Gueter{
    
    String inhalt;
    
    public Gefahrengut(int bensicherheitslevel, String inhalt) {
        super(bensicherheitslevel, inhalt);
        setInhalt(inhalt);
    }


    /**
     * 
     * SETTER UND GETTER
     */
    public void setBensicherheitslevel(int bensicherheitslevel) {
        this.bensicherheitslevel = bensicherheitslevel;
    }
    public int getBensicherheitslevel() {
        return bensicherheitslevel;
    }
    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }
    public String getInhalt() {
        return inhalt;
    }
}
