package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class SignUp {
    @FXML
    private Rectangle background;

    @FXML
    private Text firstNameText;

    @FXML
    private Text lastNameText;

    @FXML
    private Text uscIdText;

    @FXML
    public void initialize() {
        // Calculate text size based on rectangle width
        double rectangleWidth = background.getWidth();
        double textSize = rectangleWidth / 30; // Adjust this value to your preference

        // Set font size for Text elements
        Font font = Font.font(textSize);
        firstNameText.setFont(font);
        lastNameText.setFont(font);
        uscIdText.setFont(font);
    }

    @FXML
    private void SignUp() throws IOException {
        // TODO: Add your logic here for user sign-in
    }
}