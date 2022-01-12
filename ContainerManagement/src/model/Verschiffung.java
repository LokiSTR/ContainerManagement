package model;

import java.time.LocalDate;

import model.Gueter.Gueter;
import model.Transport.Route;
import model.Transport.Schiff;

//Klasse in der alles zusammengeführt wird
public class Verschiffung {
    //Ich möchte einen Container von A nach B schicken inkl. Preis, welches Schiff, welche Route, wann ist der Container da, wie schwer ist er usw

    double preis;
    Schiff schiff;
    Route route;
    LocalDate ankunft;
    Gueter gut;
    LocalDate jetzt;

    public Verschiffung(Schiff schiff, Route route, Gueter gut, double preis) {
        setGueter(gut);
        setPreis(preis);
        setRoute(route);
        setSchiff(schiff);
        // Verrechnung der Fahrtzeit mit dem heutigen Datum
        setJetzt(LocalDate.now());
        setAnkunft(jetzt.plusDays(getRoute().getZeitDays()));
    }


    /**
     * 
     * 
     * SETTER UND GETTER
     */

     public void setAnkunft(LocalDate ankunft) {
         this.ankunft = ankunft;
     }
     public LocalDate getAnkunft() {
         return ankunft;
     }
     public void setPreis(double preis) {
         this.preis = preis;
     }
     public double getPreis() {
         return preis;
     }
     public void setRoute(Route route) {
         this.route = route;
     }
     public Route getRoute() {
         return route;
     }
     public void setSchiff(Schiff schiff) {
         this.schiff = schiff;
     }
     public Schiff getSchiff() {
         return schiff;
     }
     public void setGueter(Gueter gut) {
         this.gut = gut;
     }
     public Gueter getGueter() {
         return gut;
     }
     public LocalDate getJetzt() {
         return jetzt;
     }
     public void setJetzt(LocalDate jetzt) {
         this.jetzt = jetzt;
     }
}
