package model.Personen;

public class ZivilPersonen extends Person{

    public ZivilPersonen(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public String getPersonenTyp() {
        return "Diese Person ist einer Zivilperson, ihr Name ist " + getName();
    }    
}
