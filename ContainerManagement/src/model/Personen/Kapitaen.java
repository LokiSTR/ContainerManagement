package model.Personen;

public class Kapitaen extends Person{

    int gefahreneFahrten;

    public Kapitaen(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname, personalnummer);
    }

    
    public String getPersonenTyp() {
        return "Diese Person ist der Kapitän. Sie hat die Personalnummer " + getPersonalnummer() + ", ihr Name ist " + getName();
    }
    
    /**
     * 
     * SETTER UND GETTER
     */

    public void setgefahreneFahrten(int gefahreneFahrten) {
        this.gefahreneFahrten = gefahreneFahrten;
    }
    public int getgefahreneFahrten() {
        return gefahreneFahrten;
    }
}
