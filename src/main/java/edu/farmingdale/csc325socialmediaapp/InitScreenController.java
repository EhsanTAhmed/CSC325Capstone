package edu.farmingdale.csc325socialmediaapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

import java.io.IOException;

public class InitScreenController {

    @FXML
    private ImageView imageViewMainMenu;

    @FXML
    private BorderPane initScreenBorderPane;

    @FXML
    public void initialize() {
        try {
            // Load the default pane from the FXML resource
            GridPane defaultPane = FXMLLoader.load(getClass().getResource("csc325socialmediaapp/inital-screen.fxml"));
            // Set the loaded pane into the center of the BorderPane
            initScreenBorderPane.setCenter(defaultPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void loginBtnClicked(ActionEvent event) {
        try {
            GridPane signInGridPane = FXMLLoader.load(getClass().getResource("csc325socialmediaapp/inital-screen.fxml"));
            initScreenBorderPane.getChildren().setAll(signInGridPane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void signUpBtnClicked(ActionEvent event) {

    }

}