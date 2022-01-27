import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

import controller.GueterController;
import controller.MainController;
import javafx.scene.Parent;
import javafx.scene.*;

public class NewVerschiffungController {
    
    //Controllervariablen
    MainController mc;
    GueterController gc;

    //Variablen für den Seitenwechsel
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    void VerschiffungFertig(ActionEvent event) {

    }

    //Um eine Seite zurück zu gehen
    @FXML
    void zurueck(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

        //Debugging
        System.out.println("Zurück auf vorherige Seite");
    }

    /**
     * 
     * GETTER UND SETTER   
     */
    
    public MainController getMc() {
        return mc;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }
}
