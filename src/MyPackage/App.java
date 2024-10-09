package MyPackage;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import MyPackage.Classes.*;
import MyPackage.Controllers.*;


public class App  extends Application{
    @Override
    public void start(Stage primStage){
        Cabinet cabinet = Cabinet.getInstance();
        cabinet.creerCompte("Zitouni", "Rania", "0552424453", "mr_zitouni@esi.dz", "123456789", "Babezzouar");
        cabinet.creerCompte("Hasnaoui", "Sarah", "0517124555", "ms_hasnaoui@esi.dz", "123456789", "BirKhadem");
        

        Parent root;
        try {
            root = FXMLLoader.load(getClass().getResource("./Scenes/MainScene.fxml"));
            Scene scene = new Scene(root);
             
            primStage.setScene(scene);
            primStage.show();

        } catch (IOException e) {
         
        }
      
    }

    public static void main (String args []){
        launch(args);
    }
   

    
}
   
