package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

import java.io.IOException;

public class StudentLogin {

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userNameTextField;


    public void handleInput() {
        String password = passwordTextField.getText();
        String userName = userNameTextField.getText();
        System.out.println(" " + userName + " " + password);
        // You can now use the inputText string for further processing
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
