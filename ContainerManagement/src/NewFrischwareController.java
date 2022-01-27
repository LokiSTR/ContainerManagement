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



public class NewFrischwareController {

    MainController mc;
    GueterController gc;

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private TextField tfGewicht;

    @FXML
    private TextField tfHaltbarkeit;

    @FXML
    private TextField tfInhalt;

    @FXML
    void FrischwareFertig(ActionEvent event) {
        System.out.println("Frischware fertig");
        mc.getGc().printAllObjects();

       // Stage frischwareFertig = (Stage) tfGewicht.getScene().getWindow();
        String frischwareGewicht = tfGewicht.getText();
        String frischwareInhalt = tfInhalt.getText();
        String frischwareHaltbarkeit = tfHaltbarkeit.getText();

        System.out.println("wasd");
        System.out.println("Test 1");
        gc.printAllObjects();
        System.out.println("Test 2");
        gc.addNewFrischware(frischwareGewicht, frischwareInhalt, frischwareHaltbarkeit);
        System.out.println("Test 3");
        gc.printAllObjects();
        System.out.println("Test 4");
    }

    @FXML
    void zurueck(ActionEvent event) throws IOException {
    
        System.out.println("Zurück auf vorherige Seite");
        root = FXMLLoader.load(getClass().getResource("view/NeuesGutErstellen.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        //Scene wird als fxml geladen
        scene = new Scene(root);
        //Stage bekommt die Scene
        stage.setScene(scene);
        //Stage wird angezeigt
        stage.show();
    }

    

}




/*
    public NewFrischwareController(MainController mc){
        setMc(mc);
    }

    MainController mc;
    GueterController gc;
*/
        /*

        System.out.println("Test 1");
        mc.printEveryObject();
        System.out.println("Test 2");
        //mc.getMenuc().createFrischware();
        mc.getGc().addNewFrischware("120","asiod","12.02.2002");
       
       // .addNewFrischware(frischwareGewicht, frischwareInhalt, frischwareHaltbarkeit);
        
        System.out.println("Frischware fertig");
*/

    /**
     * 
     * GETTER UND SETTER   
     */

/*
    public MainController getMc() {
        return mc;
    }
    public void setMc(MainController mc) {
        this.mc = mc;
    }

    */

