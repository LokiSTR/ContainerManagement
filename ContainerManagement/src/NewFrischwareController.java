import controller.MainController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewFrischwareController {

    @FXML
    private TextField tfGewicht;
    private TextField tfInhalt;
    private TextField tfHaltbarkeit;

    MainController mc;

    @FXML
    void FrischwareFertig(ActionEvent event) {

        System.out.println("Frischware fertig");

        Stage frischwareFertig = (Stage) tfGewicht.getScene().getWindow();
        String gewicht = tfGewicht.getText();
        String inhalt = tfInhalt.getText();
        String haltbarkeit = tfHaltbarkeit.getText();

        mc.getMenuc().createFrischware().add(gewicht, inhalt, haltbarkeit);
        
    }

}
