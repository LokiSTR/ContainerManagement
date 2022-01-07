package model.Gueter;

public class Normal extends Gueter{

    public Normal(int gutnummer, double gewicht) {
        super(gutnummer, gewicht);
    }

    public String getGutTyp() {
        return "Die Güternummer ist: " + getGutnummer() + ". Das gut ist ein normales Gut, es ist " + getGewicht() + "kg schwer.";
    }
}
