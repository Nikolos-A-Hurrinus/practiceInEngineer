package org.example.testprojectengineering;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("this is a test project for \nsoftware engineering for github stuff");
    }
}
