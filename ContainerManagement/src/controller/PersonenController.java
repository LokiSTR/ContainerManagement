package controller;

import java.util.ArrayList;

import model.Personen.Kapitaen;
import model.Personen.Person;
import model.Personen.ZivilPerson;

public class PersonenController extends ClassController {

    ArrayList<Person> personen;

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
        // TODO Auto-generated method stub
        
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
    
}
