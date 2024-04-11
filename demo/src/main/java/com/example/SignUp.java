package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class SignUp {


    @FXML
    private void signUp() throws IOException {
        switchToLogIn();
        // TODO: Add your logic here for user sign-up
    }

    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
}