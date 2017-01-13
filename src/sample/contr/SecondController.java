package sample.contr;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Controller;
import sample.models.User;
import sample.sortPackage.*;
import sample.util.IO;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SecondController implements Initializable{

    @FXML
    private Button btnSort;
    @FXML
    private Button btnCitire;

    Stage stageProblem2 = new Stage();
    Stage stageProblem3 = new Stage();
    public static User user = null;

    @FXML
    private void onSortMetods(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("sortFXML.fxml"));
            stageProblem2.setTitle("Metode de sortares");
            stageProblem2.setScene(new Scene(root, 450, 400));
            stageProblem2.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onCitireVector(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("inVectorFXML.fxml"));
            stageProblem3.setTitle("Citire Vector");
            stageProblem3.setScene(new Scene(root, 450, 400));
            stageProblem3.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onInformatii(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("InformatiiFXML.fxml"));
            stageProblem3.setTitle("Informatii");
            stageProblem3.setScene(new Scene(root, 450, 400));
            stageProblem3.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void onTabel(){
        //IO.generareNumere();
        int []array = {3, 1, 2, 5, 4, 7, 6};
        Sort s0 = new BubbleSort();
        Sort s1 = new CountingSort();
        Sort s2 = new InsertionSort();
        Sort s3 = new MergeSort();
        Sort s4 = new SelectionSort();

        Sort[] sortingAlgoritms = {s0, s1, s2, s3, s4};

        IO.deleteFileC("bubbleSort");
        IO.deleteFileC("countingSort");
        IO.deleteFileC("insertionSort");
        IO.deleteFileC("mergeSort");
        IO.deleteFileC("selectionSort");

        for (Sort s : sortingAlgoritms) {
            s.sortg(array);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("");
    }
}
