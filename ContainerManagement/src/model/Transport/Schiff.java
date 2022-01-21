package model.Transport;

import model.Personen.Kapitaen;


public class Schiff {
    
    int maxZuladung;
    Kapitaen kapitaen;
    boolean frischware;
    boolean gefahrengut;
    boolean tiere;
    boolean wertgegenstaende;

    public Schiff(int maxZuladung, Kapitaen kapitaen, boolean frischware, boolean gefahrengut, boolean tiere,boolean wertgegenstaende) {
        setFrischware(frischware);
        setGefahrengut(gefahrengut);
        setKapitaen(kapitaen);
        setMaxZuladung(maxZuladung);
        setTiere(tiere);
        setWertgegenstaende(wertgegenstaende);
    }

    /**
     * 
     * SETTER UND GETTER
     */

    public void setFrischware(boolean frischware) {
        this.frischware = frischware;
    }
    public void setGefahrengut(boolean gefahrengut) {
        this.gefahrengut = gefahrengut;
    }
    public void setKapitaen(Kapitaen kapitaen) {
        this.kapitaen = kapitaen;
    }
    public Kapitaen getKapitaen() {
        return kapitaen;
    }
    public void setMaxZuladung(int maxZuladung) {
        this.maxZuladung = maxZuladung;
    }
    public int getMaxZuladung() {
        return maxZuladung;
    }
    public void setTiere(boolean tiere) {
        this.tiere = tiere;
    }
    public void setWertgegenstaende(boolean wertgegenstaende) {
        this.wertgegenstaende = wertgegenstaende;
    }    


}