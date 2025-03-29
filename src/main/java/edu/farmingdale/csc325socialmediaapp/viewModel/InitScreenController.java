package edu.farmingdale.csc325socialmediaapp.viewModel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;
import java.util.Objects;

public class InitScreenController {

    @FXML
    private ImageView imageViewMainMenu;

    @FXML
    private BorderPane initScreenBorderPane;

//    @FXML
//    public void initialize() {
//        try {
//            FXMLLoader fxmlLoader= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("initial-screen.fxml")));
//            GridPane defaultPane = fxmlLoader.load();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

    @FXML
    void loginBtnClicked(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource("login-screen.fxml")));
            GridPane signInGridPane = fxmlLoader.load();
            initScreenBorderPane.setCenter(signInGridPane);
            initScreenBorderPane.setBottom(null);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading login-screen.fxml. Check file path.");
        } catch (NullPointerException e) {
            System.out.println("FXML file not found! Ensure it's in resources/edu/farmingdale/csc325socialmediaapp/");
        }
    }


    @FXML
    void signUpBtnClicked(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(Objects.requireNonNull(HelloApplication.class.getResource("create-user-screen.fxml")));
            GridPane signInGridPane = fxmlLoader.load();
            initScreenBorderPane.setCenter(signInGridPane);
            initScreenBorderPane.setMinHeight(signInGridPane.getHeight());
            initScreenBorderPane.setMinWidth(signInGridPane.getWidth());

            initScreenBorderPane.setBottom(null);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading create-user-screen.fxml Check file path.");
        } catch (NullPointerException e) {
            System.out.println("FXML file not found! Ensure it's in resources/edu/farmingdale/csc325socialmediaapp/");
        }
    }

}