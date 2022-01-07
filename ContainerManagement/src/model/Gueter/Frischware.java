package model.Gueter;

public class Frischware extends Gueter {

    //Vielleicht eine andere Zeiteinheit?
    int haltbarkeit;


    public Frischware(int gutnummer, double gewicht, int haltbarkeit){
        super(gutnummer, gewicht);
        setHaltbarkeit(haltbarkeit);
    }

    public String getGutTyp() {
        return "Die Güternummer ist: " + getGutnummer() + ". Dies ist eine Frischware, sie ist haltbar bis: " + getHaltbarkeit() + "! Es ist " + getGewicht() + "kg schwer.";
    }
    

    /**
     * 
     * SETTER UND GETTER
     */

    public void setHaltbarkeit(int haltbarkeit) {
        this.haltbarkeit = haltbarkeit;
    }
    public int getHaltbarkeit() {
        return haltbarkeit;
    }
}
