package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.contr.SecondController;
import sample.models.User;
import sample.repository.UserRepository;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private TextField txtEmail;
    @FXML
    private PasswordField txtPassword;
    @FXML
    private Button btnSubmit;
    @FXML
    private Label lblError;

    Stage stageProblem = new Stage();

    @FXML
    private void login() {
        if (txtEmail.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            lblError.setText("Campurile sunt obligatorii.");
            lblError.setOpacity(1);
        } else {
            User user = UserRepository.getUser(txtEmail.getText(), txtPassword.getText());
            if (user == null) {
                lblError.setText("Email-ul sau parola gresita");
                lblError.setOpacity(1);
            } else {
                System.out.println("user: " + user);
                SecondController.user = user;

                try {
                    Parent root = FXMLLoader.load(getClass().getResource("contr/second.fxml"));
                    stageProblem.setTitle("Meniu Principal");
                    stageProblem.setScene(new Scene(root, 720, 540));
                    stageProblem.show();

                    Main.mainStage.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @FXML
    private void pressLogin(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("contr/second.fxml"));
            stageProblem.setTitle("Meniu Principal");
            stageProblem.setScene(new Scene(root, 720, 540));
            stageProblem.show();

            Main.mainStage.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lblError.setOpacity(0);
    }
}

