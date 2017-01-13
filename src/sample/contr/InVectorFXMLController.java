package sample.contr;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class InVectorFXMLController implements Initializable{

    @FXML
    private Button btnTrimite;
    @FXML
    public TextField txtNumarElemente;
    @FXML
    private TextArea txtVector;

    public int numarElemente;

    @FXML
    public void trimite(){

        numarElemente = Integer.parseInt(txtNumarElemente.getText());
        System.out.println(numarElemente);

        String sVector = txtVector.getText();

        try{
            PrintWriter writer = new PrintWriter("vectorCitit.txt", "UTF-8");
            writer.print(numarElemente + "\n");
            writer.print(sVector);
            writer.close();
        }
        catch (IOException e){
            System.out.println("Erroare la deschidere/scriere in fisier");
        }

        //sVector = sVector.trim().replaceAll(" +", " ");
        //String[] parts = sVector.split(" ");

        //int[] vector;
        //vector = new int[parts.length];

        //for(int i = 0; i < parts.length; i++) {
            //vector[i] = Integer.parseInt(parts[i]);
            //System.out.println(vector[i]);
        //}
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("");
    }
}
