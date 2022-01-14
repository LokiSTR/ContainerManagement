package controller;

import java.util.ArrayList;

import model.Personen.Person;

public class PersonenController extends ClassController {

    ArrayList<Person> personen;

    public PersonenController(MainController mc) {
        super(mc);
        setPersonen(new ArrayList<Person>());
    }

    //TODO: addNew mehtoden

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
