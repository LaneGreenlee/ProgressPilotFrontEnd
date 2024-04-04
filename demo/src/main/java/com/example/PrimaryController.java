package com.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void signInAsUser() throws IOException {
        // TODO: Add your logic here for user sign-in
    }
    
    @FXML
    private void signInAsAdvisor() throws IOException {
        // TODO: Add your logic here for advisor sign-in
    }
    
    @FXML
    private void signUp() throws IOException {
        // TODO: Add your logic here for user sign-up
    }
    
    // You can keep the switchToSecondary method if you still need it for other navigation purposes
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
