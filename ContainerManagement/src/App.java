import java.io.IOException;

import controller.MainController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
 
public class App extends Application {
    
    Button button;

    public static void main(String[] args) {
        new MainController();
        launch(args);
    }
 
    public void start(Stage primaryStage) throws Exception {

    /*

    TEST----FUNKTIONIERT

    primaryStage.setTitle("Hello World!");
    button = new Button();
    button.setText("Hoffentlich klappts");

    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    
    Scene scene = new Scene(layout, 300, 250);
    primaryStage.setScene(scene);
    primaryStage.show();
    
    FXML IMPORT SCHEINT ZUM TEIL NICHT ZU FUNKTIONIEREN, WIESO WEIß ICH NOCH NICHT
    VERMUTUNG: SCENE, BZW STAGE WERDEN NICHT RICHTIG AUFGEBAUT
    */
             
    

        try {
/*       
        StackPane layout = new StackPane();
        Scene scene1 = new Scene(layout, 300, 250);

        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene1);
        primaryStage.show();
  
        

        FEHLER MUSS EIGENTLICH BEI ROOT, BZW. DEM FWML-IMPORT LIEGEN. WIESO WEIß ICH NICHT 
        */
        Parent root;
        root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        } 
        catch (IOException e) {
        
        }
    
        
    }
 
    
}