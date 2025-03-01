module edu.farmingdale.csc325socialmediaapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.farmingdale.csc325socialmediaapp to javafx.fxml;
    exports edu.farmingdale.csc325socialmediaapp;
}