package edu.farmingdale.csc325socialmediaapp.viewModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginScreenController {

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private GridPane signInGridPane;

    @FXML
    private TextField usernameTextField;

    @FXML
    void ForgotPasswordHyperlink(ActionEvent event) {

    }

    @FXML
    void createAnAccountHyperlink(ActionEvent event) {
        try {
//            InitScreenController.getInstance().signUpBtnClicked(event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void loginBtnClicked(ActionEvent event) {

    }

}
