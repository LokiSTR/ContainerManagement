//Für JavaFX benöigt
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Für Node
import javafx.scene.*;

public class MainSceneController{

    public Stage stage;
    public Scene scene;
    public Parent root;


    @FXML
    void newAusgabe(ActionEvent event) throws IOException {

        System.out.println("Etwas Ausgeben");
        //um die jeweilige FXML-Datei zu laden
        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        //ursprung des events an node casten
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Scene wird als fxml geladen
        scene = new Scene(root);
        //Stage bekommt die Scene
        stage.setScene(scene);
        //Stage wird angezeigt
        stage.show();

    }

    @FXML
    void newGut(ActionEvent event) throws IOException {
        
        System.out.println("Neues Gut");
        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();      
    }

    //Zweiter Button
    @FXML
    void newVerschiffen(ActionEvent event) throws IOException {

        System.out.println("Neue Verschiffung");
        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/Verschiffung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}