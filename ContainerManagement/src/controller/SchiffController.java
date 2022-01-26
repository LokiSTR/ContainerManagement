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
        ArrayList<String> quali1 = new ArrayList<String>();
        quali1.add("Frischware");
        quali1.add("Tiere");
        getSchiffe().add(new Schiff("Frieda",12000, getMc().getPc().getKapitaene().get(1), quali1));
        
    }

    public void printAllObjects() {
        sendOutput("Alle Schiffe:");
        for (Schiff schiff : schiffe) {
            sendOutput("Name: "+schiff.getName()+"\nKapitän: "+ schiff.getKapitaen().getName()+"\nMaximale Zuladung: "+ schiff.getMaxZuladung()+" Tonnen\nZugelassene Güter: "+ schiff.getGut_zulassungen()+"\n");
        }
    }

    public void createZulassungen() {
        //Alle Schiffe können Normalgut Transportieren!
        String f = "frischware";
        String g = "gefahrengut";
        String t = "tiere";
        String w = "wertgegenstaende";
        
        String[] qualifikation = {f,g,t,w};
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
