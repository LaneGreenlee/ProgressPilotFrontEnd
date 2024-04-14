package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import lib.*;

import java.io.IOException;

public class AdvisorLogin extends App {

    private Advisor currentAdvisor;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userNameTextField;


    private void handleAdvisorInput() {
        String password = passwordTextField.getText();
        String userName = userNameTextField.getText();
        facade.advisorLogin(userName, password);
        currentAdvisor = facade.advisorLogin(userName, password);
        System.out.println(" " + userName + " " + password);

        if(currentAdvisor != null) {
            System.out.println("Works!");
        }
        else {
            System.out.println("Fail");
        }
    }
    @FXML
    private void signUp() throws IOException {
        handleAdvisorInput();
        switchToLogIn();
    }

    @FXML
    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
}
