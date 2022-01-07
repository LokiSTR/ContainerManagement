package model.Gueter;

public class Gefahrengut extends Gueter{
    
    int gefahrenlevel;
    
    public Gefahrengut(int gutnummer, int bensicherheitslevel, int gefahrengut) {
        super(gutnummer, bensicherheitslevel);
        setGefahrenlevel(gefahrenlevel);
    }

    public String getGutTyp() {
        return "Die Güternummer ist: " + getGutnummer() + ". Dies ist Gefahrengut, es hat das Gefahrenlevel " + getGefahrenlevel() + ", außerdem braucht es das Sicherheitslevel" + getBensicherheitslevel() + ", es ist " + getGewicht() + "kg schwer.";
    }

    /**
     * 
     * SETTER UND GETTER
     */
    
    public void setGefahrenlevel(int gefahrenlevel) {
        this.gefahrenlevel = gefahrenlevel;
    }
    public void setBensicherheitslevel(int bensicherheitslevel) {
        this.bensicherheitslevel = bensicherheitslevel;
    }
    public int getBensicherheitslevel() {
        return bensicherheitslevel;
    }
    public int getGefahrenlevel() {
        return gefahrenlevel;
    }
}
