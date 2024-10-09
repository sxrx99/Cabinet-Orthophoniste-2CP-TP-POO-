package MyPackage.Controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HomeController {

    @FXML
    private Label connectedLabel;

    @FXML
    private Button logoutbtn;

    @FXML
    private Button newrendezvousbtn;

    @FXML
    private Button patientsfiles;

    @FXML
    private Button settingsbtn;

    @FXML
    private Button statisticsbtn;

    @FXML
    private Button testsanamnese;

    @FXML
    void HandleLogOutBtn(ActionEvent event) {
        // SceneManager sceneManager = new SceneManager();
        // sceneManager.switchToMainScene(event);

    }

    @FXML
    void HandleNewRendezVousBtn(ActionEvent event) {

    }

    @FXML
    void HandlePatientsFiles(ActionEvent event) {

    }

    @FXML
    void HandleSettingsBtn(ActionEvent event) {

    }

    @FXML
    void HandleStatisticsBtn(ActionEvent event) {

    }

    @FXML
    void HandleTestsAnamneseBtn(ActionEvent event) {

    }

    
    public void setConnectedUserName(String Nom , String prenom) {
        connectedLabel.setText("you're connected as :  " + Nom + " " + prenom);
    }

}
