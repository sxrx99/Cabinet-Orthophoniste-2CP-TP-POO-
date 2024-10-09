package MyPackage.Controllers;
import MyPackage.Classes.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class loginController {

    @FXML
    private Label loginMessage;

    @FXML
    private TextField mail;

    @FXML
    private TextField password;


    @FXML
    void handleLogin(ActionEvent event) {
      
        String mailInput = mail.getText();
        String pswInput = password.getText();

        Cabinet cabinet = Cabinet.getInstance();
        boolean isAuthenticated = cabinet.Authentifier(mailInput, pswInput);

        if(isAuthenticated){
            System.out.println("Login successful");
            //navigate the acceuil page
        }else{
            loginMessage.setText("Login failed");

        }

    }

}

    

