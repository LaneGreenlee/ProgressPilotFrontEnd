package com.example;

import javafx.fxml.FXML;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;

public class StudentLogin {

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
