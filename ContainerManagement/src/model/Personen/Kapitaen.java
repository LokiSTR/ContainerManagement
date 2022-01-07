package model.Personen;

import model.Personen.Personen;

public class Kapitaen extends Personen{

    int gefahrenefahrten;

    public Kapitaen(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname, personalnummer);
    }

    
    /**
     * 
     * SETTER UND GETTER
     */

    public void setGefahreneFahrten(int gefahrenefahrten) {
        this.gefahrenefahrten = gefahrenefahrten;
    }
    public int getGefahreneFahrten() {
        return gefahrenefahrten;
    }
}
