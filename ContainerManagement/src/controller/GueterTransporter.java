package controller;

import java.util.ArrayList;

import model.Gueter.Frischware;
import model.Gueter.Gefahrengut;
import model.Gueter.Gueter;
import model.Gueter.Normalgut;
import model.Gueter.Tiere;
import model.Gueter.Wertgegenstaende;

public class GueterTransporter extends ClassController{

    ArrayList<Gueter> gueterAr;

    public GueterTransporter(MainController mc) {
        super(mc);
        setGueterAr(new ArrayList<Gueter>());
    }

    /**
     * 
     * 
     * 
     * Hinzufügen neuer Güter
     * 
     */
    public void addNewFrischware(String gutnummer , String gewicht, String inhalt, String haltbarkeit){
        //Neue Frischware hinzufügen und gueterAr hinzufügen
        Frischware fw = new Frischware(Integer.parseInt(gutnummer), Double.parseDouble(gewicht), inhalt, haltbarkeit);
        getGueterAr().add(fw);
    }

    public void addNewGefahrengut(String gutnummer, String bensicherheitslevel, String inhalt) {
        //Neues Gefahrengut hinzufügen und gueterAr hinzufügen
        Gefahrengut gg = new Gefahrengut(Integer.parseInt(gutnummer), Integer.parseInt(bensicherheitslevel), inhalt);
        getGueterAr().add(gg);
    }

    public void addNewNormalgut(String gutnummer, String gewicht, String inhalt) {
        //Neues Gefahrengut hinzufügen und gueterAr hinzufügen
        Normalgut ng = new Normalgut(Integer.parseInt(gutnummer), Integer.parseInt(gewicht), inhalt);
        getGueterAr().add(ng);
    }

    public void addNewTiere(String gutnummer, String gewicht, String inhalt, String tierart){
        //Neue Tiere hinzufügen
        Tiere t = new Tiere(Integer.parseInt(gutnummer), Double.parseDouble(gewicht), inhalt, tierart);
        getGueterAr().add(t);
    }

    public void addNewWertgegenstaende(String gutnummer, String bensicherheitslevel, String gewicht, String inhalt, String wert) {
        //Neue Wertgegenstände
        Wertgegenstaende wg = new Wertgegenstaende(Integer.parseInt(gutnummer), Integer.parseInt(bensicherheitslevel), Double.parseDouble(gewicht), inhalt, Double.parseDouble(wert));
        getGueterAr().add(wg);
    }

    public void createDemodata() {
        //TODO: Demodaten schreiben
        
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
