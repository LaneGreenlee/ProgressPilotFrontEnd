package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void signInAsUser() throws IOException {
        switchToSecondary();
        // TODO: Add your logic here for user sign-in
    }
    
    @FXML
    private void signInAsAdvisor() throws IOException {
        switchToAdvisorLogin();
        // TODO: Add your logic here for advisor sign-in
    }
    
    @FXML
    private void signUp() throws IOException {
        switchToSignUp();
        // TODO: Add your logic here for user sign-up
    }
    
    // You can keep the switchToSecondary method if you still need it for other navigation purposes
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    private void switchToAdvisorLogin() throws IOException {
        App.setRoot("advisorLogin");
    }
    private void switchToSignUp() throws IOException {
        App.setRoot("SignUp");
    }
}
