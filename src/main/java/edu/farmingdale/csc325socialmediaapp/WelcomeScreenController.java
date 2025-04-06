package edu.farmingdale.csc325socialmediaapp;


import javafx.animation.PauseTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class WelcomeScreenController {

    @FXML
    private StackPane rootPane;

    @FXML
    public void initialize() {
        PauseTransition pause = new PauseTransition(Duration.seconds(2)); // Show for 2 seconds
        pause.setOnFinished(event -> switchToNextScene());
        pause.play();
    }

    private void switchToNextScene() {
        try {
            Parent nextRoot = FXMLLoader.load(getClass().getResource("inital-screen.fxml"));
            Scene scene = new Scene(nextRoot);
            Stage stage = (Stage) rootPane.getScene().getWindow();
            stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

