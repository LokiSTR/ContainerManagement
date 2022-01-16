package model.Personen;

public class Kapitaen extends Person{

    int gefahrenefahrten;

    public Kapitaen(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname, personalnummer);
    }

    
    public String getPersonenTyp() {
        return "Diese Person ist der Kapitän. Sie hat die Personalnummer " + getPersonalnummer() + ", ihr Name ist " + getVorname() + " " + getNachname();
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
