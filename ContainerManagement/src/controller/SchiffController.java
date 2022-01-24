package controller;

import java.util.ArrayList;

import model.Transport.Schiff;

public class SchiffController extends ClassController {

    ArrayList<Schiff> schiffe;

    public SchiffController(MainController mc) {
        super(mc);
        setSchiffe(new ArrayList<Schiff>());
    }

    @Override
    public void createDemodata() {
        getSchiffe().add(new Schiff(12000, getMc().getPc().getKapitaene().get(1), null));
        
    }

    public void createZulassungen() {
        //Alle Schiffe können Normalgut Transportieren!
        String f = "frischware";
        String g = "gefahrengut";
        String t = "tiere";
        String w = "wertgegenstaende";
        ArrayList<String> zulassung = new ArrayList<String>();
    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setSchiffe(ArrayList<Schiff> schiffe) {
         this.schiffe = schiffe;
     }
     public ArrayList<Schiff> getSchiffe() {
         return schiffe;
     }
    
}
