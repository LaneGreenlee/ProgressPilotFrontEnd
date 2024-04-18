package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import lib.DataLoader;
import lib.ProgessPilotFACADE;
import lib.Student;
import lib.UserList;

public class StudentLanding extends App {

    public static Student currentStudent;

    @FXML
    private void switchToOverview() throws IOException {
        setOverview();
    }

    @FXML
    private void setOverview() throws IOException {
        App.setRoot("studentOverview");
    }

    @FXML
    private void chooseElective() throws IOException {
        App.setRoot("viewElective");
    }

    @FXML
    private void chooseApplicationArea() throws IOException {
        App.setRoot("applicationArea");
    }
}