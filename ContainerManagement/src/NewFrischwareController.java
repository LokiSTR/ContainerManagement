import controller.GueterController;
import controller.MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NewFrischwareController {

    @FXML
    private TextField tfGewicht;
    private TextField tfInhalt;
    private TextField tfHaltbarkeit;

    MainController mc;
    GueterController gc;
    @FXML
    void FrischwareFertig(ActionEvent event) {

        System.out.println("Frischware fertig");
        mc.getGc().printAllObjects();

       // Stage frischwareFertig = (Stage) tfGewicht.getScene().getWindow();
        String frischwareGewicht = tfGewicht.getText();
        String frischwareInhalt = tfInhalt.getText();
        String frischwareHaltbarkeit = tfHaltbarkeit.getText();

        System.out.println("Test 1");
        gc.printAllObjects();
        System.out.println("Test 2");
        gc.addNewFrischware(frischwareGewicht, frischwareInhalt, frischwareHaltbarkeit);
        System.out.println("Test 3");
        gc.printAllObjects();
        System.out.println("Test 4");
        
    }

}
