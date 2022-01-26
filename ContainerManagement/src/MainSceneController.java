// import controller.MainController;
//Für JavaFX benöigt
import javafx.event.ActionEvent;
import javafx.fxml.FXML;


public class MainSceneController{

  //  MainController mc;

    // public MainSceneController(MainController mc) {
        // setMc(mc);
    // }

    @FXML
    void newGut(ActionEvent event) {
        
        System.out.println("Neues Gut");
        //Auswählen welches Gut
    }

    //Zweiter Button
    @FXML
    void newVerschiffen(ActionEvent event) {
        System.out.println("Neuer Schiffsweg");
    }




    /**
     * 
     * SETTER UND GETTER
     */
/*
     public void setMc(MainController mc) {
         this.mc = mc;
     }
     public MainController getMc() {
         return mc;
     }*/
}