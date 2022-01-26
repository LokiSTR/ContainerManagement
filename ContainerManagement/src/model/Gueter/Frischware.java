package model.Gueter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Frischware extends Gueter {

    //Vielleicht eine andere Zeiteinheit?
    Date haltbarkeit;
    SimpleDateFormat sdf;


    public Frischware(double gewicht, String inhalt, String haltbarkeit){
        super(gewicht, inhalt);
        setSdf(new SimpleDateFormat("dd.MM.yyyy"));
        try {
            setHaltbarkeit(getSdf().parse(haltbarkeit));
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        setGutTyp("f");
    }

    

    /**
     * 
     * SETTER UND GETTER
     */

     public void setHaltbarkeit(Date haltbarkeit) {
         this.haltbarkeit = haltbarkeit;
     }
     public Date getHaltbarkeit() {
         return haltbarkeit;
     }
     public void setSdf(SimpleDateFormat sdf) {
         this.sdf = sdf;
     }
    public SimpleDateFormat getSdf() {
        return sdf;
    }
}
