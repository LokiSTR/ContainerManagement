package model.Personen;

public class Personen {

    String vorname;
    String nachname;
    int personalnummer;


    public Personen(String vorname, String nachname, int personalnummer){
        setVorname(vorname);
        setNachname(nachname);
        setPersonalnummer(personalnummer);
    }


    public Personen(String vorname, String nachname){
        setVorname(vorname);
        setNachname(nachname);
    }


    /**
     * 
     * SETTER UND GETTER
     */

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public int getPersonalnummer() {
        return personalnummer;
    }
    public String getVorname() {
        return vorname;
    }
}
