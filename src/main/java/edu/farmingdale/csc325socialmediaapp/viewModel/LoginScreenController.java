package edu.farmingdale.csc325socialmediaapp.viewModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.util.Objects;

public class LoginScreenController {
    private String packagePath = "/edu/farmingdale/csc325socialmediaapp/";
    @FXML
    private PasswordField passwordTextField;

    @FXML
    private GridPane signInGridPane;

    @FXML
    private TextField usernameTextField;

    private BorderPane bp = InitScreenController.getInitScreenBorderPane();

    @FXML
    void ForgotPasswordHyperlink(ActionEvent event) {

    }

    @FXML
    void createAnAccountHyperlink(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource(packagePath + "create-user-screen.fxml")));
            GridPane signInGridPane = fxmlLoader.load();
            bp.setCenter(signInGridPane);
            bp.setMinHeight(signInGridPane.getHeight());
            bp.setMinWidth(signInGridPane.getWidth());
            bp.setBottom(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @FXML
    void loginBtnClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource(packagePath + "home-screen.fxml")));
            GridPane signInGridPane = fxmlLoader.load();
            bp.setCenter(signInGridPane);
            bp.setMinHeight(signInGridPane.getHeight());
            bp.setMinWidth(signInGridPane.getWidth());
            bp.setBottom(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
