package controller;

import java.util.ArrayList;

import model.Gueter.Frischware;
import model.Gueter.Gefahrengut;
import model.Gueter.Gueter;
import model.Gueter.Normalgut;
import model.Gueter.Tiere;
import model.Gueter.Wertgegenstaende;

public class GueterController extends ClassController{

    ArrayList<Gueter> gueterAr;


    public GueterController(MainController mc) {
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
        Frischware fw = new Frischware( Double.parseDouble(gewicht), inhalt, haltbarkeit);
        getGueterAr().add(fw);
    }

    public void addNewGefahrengut(String gutnummer, String bensicherheitslevel, String inhalt) {
        //Neues Gefahrengut hinzufügen und gueterAr hinzufügen
        Gefahrengut gg = new Gefahrengut( Integer.parseInt(bensicherheitslevel), inhalt);
        getGueterAr().add(gg);
    }

    public void addNewNormalgut(String gutnummer, String gewicht, String inhalt) {
        //Neues Gefahrengut hinzufügen und gueterAr hinzufügen
        Normalgut ng = new Normalgut( Integer.parseInt(gewicht), inhalt);
        getGueterAr().add(ng);
    }

    public void addNewTiere(String gutnummer, String gewicht, String inhalt, String tierart){
        //Neue Tiere hinzufügen
        Tiere t = new Tiere( Double.parseDouble(gewicht), inhalt, tierart);
        getGueterAr().add(t);
    }

    public void addNewWertgegenstaende(String gutnummer, String bensicherheitslevel, String gewicht, String inhalt, String wert) {
        //Neue Wertgegenstände
        Wertgegenstaende wg = new Wertgegenstaende(Integer.parseInt(bensicherheitslevel), Double.parseDouble(gewicht), inhalt, Double.parseDouble(wert));
        getGueterAr().add(wg);
    }


    // quick sort, nach parametern sortieren

    public void createDemodata() {

        getGueterAr().add(new Frischware(230, "Bananen", "22.03.2022"));
        getGueterAr().add(new Frischware(259, "Äpfel", "23.05.2022"));

        getGueterAr().add(new Gefahrengut(4, "Baterien"));
        getGueterAr().add(new Gefahrengut(2, "Feuerzeuge"));

        getGueterAr().add(new Normalgut(200, "Socken"));
        getGueterAr().add(new Normalgut(100, "Bücher"));

        getGueterAr().add(new Tiere(500, "Uwe", "Bulle"));
        getGueterAr().add(new Tiere(20, "20 Tiere", "Enten"));

        getGueterAr().add(new Wertgegenstaende(3, 30, "Geld", 2000));
        getGueterAr().add(new Wertgegenstaende(5, 2, "Edelmetall", 200));

        
    }

    public void printAllObjects() {
        int i=0;
        sendOutput("Alle Güter");
        for (Gueter gut : gueterAr) {
            if (gut instanceof Frischware) {
                // Umwandeln von gut in Frischware
                Frischware f = (Frischware) gut;
                sendOutput(f.getGutnummer()+"\nGewicht: "+ f.getGewicht()+" kg\nInhalt: "+ f.getInhalt()+"\nMindestens haltbar bis: "+ f.getSdf().format(f.getHaltbarkeit()));
                //DONE: Wie kann ich Objektspezifische Eigenschaften Abrufen?
                // Durch umwandeln des Datentyps
            
            }

            if (gut instanceof Gefahrengut) {
                //Umwandeln in Gefahrengut
                Gefahrengut g = (Gefahrengut) gut;
                sendOutput(g.getGutnummer()+"\n");
            }
             else {
                
            }
        }
        
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
