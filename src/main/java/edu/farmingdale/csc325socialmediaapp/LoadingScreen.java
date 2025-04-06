package edu.farmingdale.csc325socialmediaapp;

import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class LoadingScreen {

    public static void showLoadingPane(Pane container, Runnable nextContentLoader) {
        try {
            FXMLLoader loader = new FXMLLoader(LoadingScreen.class.getResource("loading-screen.fxml"));
            Parent loadingPane = loader.load();

            // Save the original screen (optional, if you want to restore it)
            Parent originalContent = (Parent) container.getChildren().get(0);

            // Replace current content with loading pane
            container.getChildren().setAll(loadingPane);

            Task<Void> task = new Task<>() {
                @Override
                protected Void call() throws Exception {
                    Thread.sleep(1000); // Simulate loading
                    return null;
                }
            };

            task.setOnSucceeded(e -> {
                nextContentLoader.run(); // Load the next screen
            });

            new Thread(task).start();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void transitionPane(Pane container, String fxmlFile) {
        showLoadingPane(container, () -> {
            try {
                FXMLLoader loader = new FXMLLoader(LoadingScreen.class.getResource(fxmlFile));
                Parent newContent = loader.load();
                container.getChildren().setAll(newContent);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }
}
