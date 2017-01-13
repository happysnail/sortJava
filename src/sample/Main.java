package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.contr.InVectorFXMLController;
import sample.sortPackage.*;
import sample.util.IO;

public class Main extends Application {

    public static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        mainStage = primaryStage;
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 720, 540));
        primaryStage.show();
    }

    public static void main(String[] args) {

        //IO.readFile();

        launch(args);

        //InVectorFXMLController inVector = new InVectorFXMLController();
        //System.out.println(inVector.numarElemente);
        //System.out.println(inVector.txtNumarElemente.getText()+ " sss");
    }
}
