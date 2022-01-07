package model.Personen;

public class ZivilPersonen extends Personen{

    public ZivilPersonen(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public String getPersonenTyp() {
        return "Diese Person ist einer Zivilperson, ihr Name ist " + getVorname() + " " + getNachname();
    }    
}
