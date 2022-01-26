import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
 
import controller.MainController;

public class App extends Application {
    
    public static Stage primaryStage;
    public static AnchorPane rootLayout;
    
    public static void main(String[] args) throws IOException {
        launch(args);
        new MainController();
    }
 
    public void start(Stage primaryStage) throws Exception {

        // Load root layout from fxml file.
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("view/MainScene.fxml"));
        rootLayout = (AnchorPane) loader.load();
     
        //Zum Ausgeben der Location der FXML Datei
        System.out.println(loader.getLocation());


        // Show the scene containing the root layout.
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(new Scene(rootLayout));
        primaryStage.show();            
         
    }
       
    //Getter     
    public Stage getPrimaryStage() {
        return primaryStage;
    }
}