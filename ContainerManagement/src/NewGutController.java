import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.*;

public class NewGutController {

    private Stage stage;
    private Scene scene;
    private Parent root;


    @FXML
    void createFrischware(ActionEvent event) throws IOException {

        System.out.println("Frischware erstellen");
        //Zu finden im MainSceneController.java
        root = FXMLLoader.load(getClass().getResource("view/Frischware.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();   
        System.out.println("Frischware erstellen");

    }

    @FXML
    void createGefahrengut(ActionEvent event) {

        System.out.println("Gefahrengut erstellen");
/*        Parent root = FXMLLoader.load(getClass().getResource("NeueVerschiffung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show */
    }

    @FXML
    void createNormalGut(ActionEvent event) {

        System.out.println("Gut erstellen");
/*        Parent root = FXMLLoader.load(getClass().getResource("NeueVerschiffung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show */
    }

    @FXML
    void createTiere(ActionEvent event) {

        System.out.println("Tier erstellen");
/*        Parent root = FXMLLoader.load(getClass().getResource("NeueVerschiffung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show */
    }

    @FXML
    void createWertgegenstaende(ActionEvent event) {

        System.out.println("Wertgegenstand erstellen");
/*        Parent root = FXMLLoader.load(getClass().getResource("NeueVerschiffung.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show */
    }

    @FXML
    void zurueckAufMain(ActionEvent event) throws IOException {

        System.out.println("Zurück auf Hauptseite");
        root = FXMLLoader.load(getClass().getResource("view/MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Scene wird als fxml geladen
        scene = new Scene(root);
        //Stage bekommt die Scene
        stage.setScene(scene);
        //Stage wird angezeigt
        stage.show();
    }

}