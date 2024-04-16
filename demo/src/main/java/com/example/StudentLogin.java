package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lib.DataLoader;
import lib.ProgessPilotFACADE;
import lib.Student;
import lib.UserList;

public class StudentLogin extends App{

    public static Student currentStudent;

    @FXML
    private TextField passwordTextField;

    @FXML
    private TextField userNameTextField;


    private void handleInput() {
        String password = passwordTextField.getText();
        String userName = userNameTextField.getText();
        System.out.println(App.students);
        currentStudent = facade.studentLogin(userName, password);
        System.out.println(" " + userName + " " + password);

        if(currentStudent != null) {
            System.out.println("Works!");
        }
        else {
            System.out.println("Fail");
        }
        // You can now use the inputText string for further processing
    }

    @FXML
    private void signUp() throws IOException {
        handleInput();
        switchToOverview();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToOverview() throws IOException {
        App.setRoot("studentOverview");
    }
}
