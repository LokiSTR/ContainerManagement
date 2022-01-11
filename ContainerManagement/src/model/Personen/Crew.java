package model.Personen;

public class Crew extends Personen{

    public Crew(String vorname, String nachname, int personalnummer) {
        super(vorname, nachname, personalnummer);
    }

    public String getPersonenTyp() {
        return "Diese Person ist ein Teil der Crew. Sie hat die Personalnummer " + getPersonalnummer() + ", ihr Name ist " + getName();
    }
    
}
