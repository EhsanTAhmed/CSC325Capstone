package edu.farmingdale.csc325socialmediaapp.viewModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class CreateUserController {

    @FXML
    private CheckBox agreedToTermsAndConditionsCheckBox;

    @FXML
    private TextField confirmPasswordTextField;

    @FXML
    private HBox emailTextField;

    @FXML
    private TextField fNameTextField;

    @FXML
    private TextField lNameTextField;

    @FXML
    private ImageView logoImageView;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button registerBtn;

    @FXML
    private TextField securityAnswerTextField;

    @FXML
    private ComboBox<?> securityQuestionComboBox;

    @FXML
    private TextField usernameTextField;


    @FXML
    void loginBtnClciked(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource("create-user-screen.fxml")));
            GridPane signInGridPane = fxmlLoader.load();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading create-user-screen.fxml Check file path.");
        } catch (NullPointerException e) {
            System.out.println("FXML file not found! Ensure it's in resources/edu/farmingdale/csc325socialmediaapp/");
        }
    }

    @FXML
    void checkBoxClickedUsernameIsEmail(ActionEvent event) {
        usernameTextField.setText(emailTextField.getAccessibleText().trim());
        usernameTextField.disableProperty();
    }

    @FXML
    void registerBtnClicked(ActionEvent event) {

    }

    @FXML
    void termsAndConditionCheckBoxClicked(ActionEvent event) {
        registerBtn.setDefaultButton(true);

    }

    @FXML
    void termsAndConditionHyperlinkClicked(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource("terms-and-conditions-screen.fxml")));
            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Terms and Conditions");
            stage.setScene(new Scene(root));
            stage.initModality(Modality.WINDOW_MODAL);
            stage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading terms-and-conditions-screen.fxml. Check file path.");
        } catch (NullPointerException e) {
            System.out.println("FXML file not found! Ensure it's in resources/edu/farmingdale/csc325socialmediaapp/");
        }
    }

}
