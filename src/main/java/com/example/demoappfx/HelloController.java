package com.example.demoappfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hello FX App!");
    }

    @FXML
    protected void onNextSceneButtonClick(){
        welcomeText.setText("Next Scene coming soon.");
    }
}