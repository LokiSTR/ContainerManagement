package model.Gueter;

public class Gefahrengut extends Gueter{
    
    int gefahrenlevel;
    int bensicherheitslevel;

    public Gefahrengut(int gutnummer, int gefahrenlevel, int bensicherheitslevel){
        super(gutnummer);
        setGefahrenlevel(gefahrenlevel);
        setBensicherheitslevel(bensicherheitslevel);
    }

    public String getGutTyp() {
        return "Dies ist Gefahrengut, es hat das Gefahrenlevel " + getGefahrenlevel() + ", außerdem braucht es das Sicherheitslevel" + getBensicherheitslevel();
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
