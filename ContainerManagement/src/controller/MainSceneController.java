package controller;

import javafx.event.ActionEvent;

public class MainSceneController{

    MainController mc;

    public MainSceneController(MainController mc) {
        setMc(mc);
    }

    void newGut(ActionEvent event) {
        //Auswählen welches Gut
    }

    void newVerschiffen(ActionEvent event) {

    }

    /**
     * 
     * SETTER UND GETTER
     */

     public void setMc(MainController mc) {
         this.mc = mc;
     }
     public MainController getMc() {
         return mc;
     }
}