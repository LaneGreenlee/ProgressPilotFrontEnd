package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;

public class AdvisorLogin {

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userNameTextField;


    private void handleInput() {
        String password = passwordTextField.getText();
        String userName = userNameTextField.getText();
        System.out.println(" " + userName + " " + password);
        // You can now use the inputText string for further processing
    }
    @FXML
    private void signUp() throws IOException {
        handleInput();
        switchToLogIn();
    }

    @FXML
    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
}
