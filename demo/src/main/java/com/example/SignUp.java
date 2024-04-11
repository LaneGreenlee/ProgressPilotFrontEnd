package com.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.Font;


public class SignUp {

    @FXML
    private TextField uscIDtextField;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userNameTextField;

    @FXML
    private ComboBox userType;


    public void handleInput() {
        String uscId = uscIDtextField.getText();
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String password = passwordTextField.getText();
        String userName = userNameTextField.getText();
        String type = (String) userType.getValue();
        System.out.println(firstName + " " + lastName + " " + password + " " + userName + " " + uscId + " " + type);
        // You can now use the inputText string for further processing
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