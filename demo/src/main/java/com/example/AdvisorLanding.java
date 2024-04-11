package com.example;

import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.text.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;


public class AdvisorLanding {
    @FXML
    private Text URL;
    @FXML
    public void initialize() {
        // Calculate text size based on rectangle width
        // Set font size for each Text element
        Font umlFont = new Font(50);
        TextAlignment urlAlignment = TextAlignment.RIGHT;
        URL.setFont(umlFont);
        URL.setTextAlignment(urlAlignment);

    }


}
