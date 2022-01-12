package controller;

import java.util.ArrayList;

import model.Gueter.Frischware;
import model.Gueter.Gueter;

public class GueterTransporter extends ClassController{

    ArrayList<Gueter> gueterAr;

    public GueterTransporter(MainController mc) {
        super(mc);
        setGueterAr(new ArrayList<Gueter>());
    }

    public void createDemodata() {
        getGueterAr().add(new Frischware(235, 23, "24.01.2022"));
        
    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setGueterAr(ArrayList<Gueter> gueterAr) {
         this.gueterAr = gueterAr;
     }
     public ArrayList<Gueter> getGueterAr() {
         return gueterAr;
     }
    
}
