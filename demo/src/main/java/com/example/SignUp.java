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
    private Text usernameText;

    @FXML
    private Text passwordText;

    @FXML
    private Text iAmAText;

    @FXML
    private Text signupText;

    @FXML
    public void initialize() {
        // Calculate text size based on rectangle width
        double rectangleWidth = background.getWidth();
        double textSize = rectangleWidth / 40; // Adjust this value to your preference

        // Set font size for each Text element
        Font font = new Font(textSize);
        Font signUpFont = new Font(50);
        firstNameText.setFont(font);
        lastNameText.setFont(font);
        uscIdText.setFont(font);
        usernameText.setFont(font);
        passwordText.setFont(font);
        iAmAText.setFont(font);
        signupText.setFont(signUpFont);
    }


    @FXML
    private void signUp() throws IOException {
        switchToLogIn();
        // TODO: Add your logic here for user sign-up
    }

    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
}