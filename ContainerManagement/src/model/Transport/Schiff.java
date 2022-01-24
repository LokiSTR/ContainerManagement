package model.Transport;

import java.util.ArrayList;

import model.Gueter.Gueter;
import model.Personen.Kapitaen;


public class Schiff {
    
    int maxZuladung;
    Kapitaen kapitaen;
    //Arraylist mit Angaben darüber, welche Güter mit diesem Schiff transportiert werden können
    //TODO
    ArrayList<Gueter> gut_zulassungen;

    public Schiff(int maxZuladung, Kapitaen kapitaen, ArrayList<Gueter> gut_zulassungen) {
        setKapitaen(kapitaen);
        setMaxZuladung(maxZuladung);
        setGut_zulassungen(gut_zulassungen);
    }

    /**
     * 
     * SETTER UND GETTER
     */


    
     public void setKapitaen(Kapitaen kapitaen) {
         this.kapitaen = kapitaen;
     }
     public Kapitaen getKapitaen() {
         return kapitaen;
     }
     public void setMaxZuladung(int maxZuladung) {
         this.maxZuladung = maxZuladung;
     }
     public int getMaxZuladung() {
         return maxZuladung;
     }
     public void setGut_zulassungen(ArrayList<Gueter> gut_zulassungen) {
         this.gut_zulassungen = gut_zulassungen;
     }
     public ArrayList<Gueter> getGut_zulassungen() {
         return gut_zulassungen;
     }

}