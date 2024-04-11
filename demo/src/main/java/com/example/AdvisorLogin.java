package com.example;

import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;

public class AdvisorLogin {

    @FXML
    private Text usernameText;

    @FXML
    private Text passwordText;

    @FXML
    public void initialize() {

        Font font = new Font(50);
        //Font signUpFont = new Font(50);
        usernameText.setFont(font);
        passwordText.setFont(font);
    }

    @FXML
    private void signUp() throws IOException {
        switchToLogIn();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
}
