package controller;

import java.util.ArrayList;

import model.Personen.Crew;
import model.Personen.Kapitaen;
import model.Personen.Person;
import model.Personen.ZivilPerson;

public class PersonenController extends ClassController {

    ArrayList<Person> personen;

    //Kapitäne werden in Extra Array gespeichert, da sie beim Schiff mit angegeben werden müssen.
    ArrayList<Kapitaen> kapitaene;

    public PersonenController(MainController mc) {
        super(mc);
        setPersonen(new ArrayList<Person>());
    }

    public void addNewZivilperson(String vorname, String nachname) {
        ZivilPerson zp = new ZivilPerson(vorname, nachname);
        getPersonen().add(zp);
    }

    public void addNewKapitaen(String vorname, String nachname, String personalnummer) {
        Kapitaen kp = new Kapitaen(vorname, nachname, Integer.parseInt(personalnummer));
        getPersonen().add(kp);
    }


    @Override
    public void createDemodata() {
        getKapitaene().add(new Kapitaen("Axel", "Springer", 27389));
        getKapitaene().add(new Kapitaen("Tom", "Hindenburg", 27240));

        getPersonen().add(new Crew("Sybille", "Springer", 27389));

        getPersonen().add(new ZivilPerson("Holger", "Trampe"));
        
        
    }

    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setPersonen(ArrayList<Person> personen) {
         this.personen = personen;
     }
     public ArrayList<Person> getPersonen() {
         return personen;
     }
     public void setKapitaene(ArrayList<Kapitaen> kapitaene) {
         this.kapitaene = kapitaene;
     }
     public ArrayList<Kapitaen> getKapitaene() {
         return kapitaene;
     }
    
}
