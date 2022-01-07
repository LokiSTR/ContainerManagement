package model.Gueter;

public abstract class Gueter {
    
    int gutnummer;

    public Gueter(int gutnummer){
        setGutnummer(gutnummer);
    }

    public abstract String getGutTyp();

    /**
     * 
     * SETTER UND GETTER
     */

    public void setGutnummer(int gutnummer) {
        this.gutnummer = gutnummer;
    }
    public int getGutnummer() {
        return gutnummer;
    }
}
