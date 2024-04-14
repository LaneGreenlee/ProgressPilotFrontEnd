package com.example;
import lib.*;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class SignUp {

    // Instance of the facade class to interact with the system
    private ProgessPilotFACADE facade = new ProgessPilotFACADE();

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
    private ComboBox<String> userType; // Ensure the ComboBox is of type String

    @FXML
    private void signUp() throws IOException {
        // Retrieve user input from the text fields
        String uscId = uscIDtextField.getText();
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String password = passwordTextField.getText();
        String userName = userNameTextField.getText();
        String type = userType.getValue(); // Get the selected user type from ComboBox

        // Depending on the type, call the corresponding method in the facade
        if (type.equals("Student")) {
            // Handle student sign up
            User newUser = facade.signup(userName, password, firstName, lastName, uscId);
            // You may want to check if newStudent is null (meaning sign up failed)
        } else if (type.equals("Advisor")) {
            // Handle advisor sign up
            User newUser = facade.signup(userName, password, firstName, lastName, uscId);
            // Check if newAdvisor is null as well
        } else {
            // Handle generic user sign up
            User newUser = facade.signup(userName, password, firstName, lastName, uscId);
            // Check if newUser is null
        }

        // After successful sign up, switch to login page
        switchToLogIn();
    }

    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
}
