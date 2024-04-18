package com.example;

import javafx.fxml.FXML;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lib.Course;
import lib.Grade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentOverview {


    @FXML
    private VBox vbox;

    @FXML
    private Text outputText;

    @FXML
    private VBox vbox2;

    @FXML
    private Text courseToTake;

    @FXML
    private Text notes;

    @FXML
    public void initialize() {

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderCourse = new StringBuilder();
        StringBuilder stringBuilderNotes = new StringBuilder();


        // Iterate over the HashMap entries and append key-value pairs to the StringBuilder
            System.out.println("\tCourse \t\t\t\t Grade");
        for (Map.Entry<Course, Grade> entry : StudentLogin.currentStudent.completedCourses.entrySet()) {
            stringBuilder.append("\t     " + entry.getKey().getCourseCode() + (" ") +entry.getKey().getCourseNumber()+ (", \t\t\t") + entry.getValue() + ("\n"));
        }

        ArrayList<Course> remainingCourses = StudentLogin.currentStudent.getCoursesRemaining();

        for (Course course : remainingCourses) {
            stringBuilderCourse.append(("\t") + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        }

        for (String notes : StudentLogin.currentStudent.getNotes())
            stringBuilderNotes.append(notes + ("\n"));
        // Set the accumulated text to the Text element
        outputText.setText(stringBuilder.toString());
        courseToTake.setText(stringBuilderCourse.toString());
        notes.setText(stringBuilderNotes.toString());
    }

    @FXML
    private void viewElec() throws IOException {
        switchToViewElec();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToViewElec() throws IOException {
        App.setRoot("viewElective");
    }

    @FXML
    private void switchToLanding() throws IOException {
        App.setRoot("studentLanding");
    }

    @FXML
    private void viewApArea() throws IOException {
        switchToViewApArea();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToViewApArea() throws IOException {
        App.setRoot("applicationArea");
    }

}
