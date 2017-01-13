package sample.contr;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;
import sample.sortPackage.*;

public class SortController implements Initializable {

    @FXML
    private Tab tabBuble;
    @FXML
    private Tab tabMerge;
    @FXML
    private Tab tabCounting;
    @FXML
    private Tab tabSelection;
    @FXML
    private Tab tabInsertion;
    @FXML
    private TextArea txtBuble;
    @FXML
    private TextArea txtMerge;
    @FXML
    private TextArea txtCounting;
    @FXML
    private TextArea txtSelection;
    @FXML
    private TextArea txtInsertion;

    InVectorFXMLController asd = new InVectorFXMLController();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        int i;
        InVectorFXMLController inVect = new InVectorFXMLController();
        i = inVect.numarElemente;
        System.out.println("dadas" + i);
        txtBuble.setText(String.valueOf(i)); //sbt
    }

    @FXML
    public void onBubble(){
        Sort s0 = new BubbleSort();
        int []array = {3, 1, 2, 5, 4, 7, 6};
        s0.sortg(array);
    }

}
