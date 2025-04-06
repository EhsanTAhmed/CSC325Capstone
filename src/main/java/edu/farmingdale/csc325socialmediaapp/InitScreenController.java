package edu.farmingdale.csc325socialmediaapp;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class InitScreenController {

    @FXML
    private ImageView imageViewMainMenu;

    @FXML
    private BorderPane initScreenBorderPane;

    private final List<Image> images = new ArrayList<>();
    private int currentIndex = 0;

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

        loadImagesFromFolder();
        startImageSlideshow();
    }

    private void loadImagesFromFolder() {
        try {
            URL imagesFolder = getClass().getResource("/edu/farmingdale/csc325socialmediaapp/Images/");
            if (imagesFolder != null) {
                String path = imagesFolder.getPath();
                var folder = new java.io.File(path);
                for (java.io.File file : Objects.requireNonNull(folder.listFiles())) {
                    if (file.getName().matches(".*\\.(png|jpg|jpeg|gif)")) {
                        images.add(new Image(file.toURI().toString()));
                    }
                }
            } else {
                System.err.println("Images folder not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void startImageSlideshow() {
        if (images.isEmpty()) return;

        imageViewMainMenu.setImage(images.get(0));

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            currentIndex = (currentIndex + 1) % images.size();
            imageViewMainMenu.setImage(images.get(currentIndex));
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
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
