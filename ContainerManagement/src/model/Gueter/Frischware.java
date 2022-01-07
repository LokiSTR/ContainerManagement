package model.Gueter;

public class Frischware extends Gueter {

    //Vielleicht eine andere Zeiteinheit?
    int haltbarkeit;


    public Frischware(int gutnummer, int haltbarkeit){
        super(gutnummer);
        setHaltbarkeit(haltbarkeit);
    }

    public String getGutTyp() {
        return "Dies ist eine Frischware, sie ist haltbar bis: " + getHaltbarkeit() + "!";
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
