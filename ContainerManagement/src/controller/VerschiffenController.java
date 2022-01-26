package controller;

import java.util.ArrayList;

import model.Verschiffung;
import model.Gueter.Gueter;
import model.Transport.Route;
import model.Transport.Schiff;

public class VerschiffenController extends ClassController{

    ArrayList<Verschiffung> verschiffungen;

    public VerschiffenController(MainController mc) {
        super(mc);
        setVerschiffungen(new ArrayList<Verschiffung>());
    }

    //Neue Verschiffung, Preis und Datum sind in der Eingabe in Strings und werden anschließend umgewandelt. Eventuell muss das Datum noch modifiziert werden.
    public void addNewVerschiffung(Schiff schiff, Route route, Gueter gut, String preis) {

        Verschiffung vs = new Verschiffung(schiff,route,  gut, Double.parseDouble(preis));
        getVerschiffungen().add(vs);
        
    }

    @Override
    public void createDemodata() {
        getVerschiffungen().add(new Verschiffung(getMc().getSc().getSchiffe().get(1), getMc().getRc().getRouten().get(1), getMc().getGc().getGueterAr().get(1), 2345.3)); 
        
        
    }
    
    
    //TODO: New verschiffen

    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setVerschiffungen(ArrayList<Verschiffung> verschiffungen) {
         this.verschiffungen = verschiffungen;
     }
     public ArrayList<Verschiffung> getVerschiffungen() {
         return verschiffungen;
     }
}
