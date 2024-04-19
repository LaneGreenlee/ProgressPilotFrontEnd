package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lib.Course;
import lib.Grade;
import lib.Student;
import lib.UserList;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdvisorOverview extends App {

    @FXML
    private TextArea notesTextArea;

        @FXML
        private VBox vbox;

        @FXML
        private Text outputText;

        @FXML
        private VBox vbox2;

        @FXML
        private Text courseToTake;

        @FXML
        private Text studentName;


        @FXML
        public void initialize() {
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder stringBuilderCourse = new StringBuilder();

            studentName.setText("Viewing: " + AdvisorLanding.viewingStudent.getFirstName() + " " + AdvisorLanding.viewingStudent.getLastName());
            // Iterate over the HashMap entries and append key-value pairs to the StringBuilder
            for (Map.Entry<Course, Grade> entry : AdvisorLanding.viewingStudent.completedCourses.entrySet()) {
                stringBuilder.append("\t     " + entry.getKey().getCourseCode() + (" ") +entry.getKey().getCourseNumber()+ (", \t\t\t") + entry.getValue() + ("\n"));
            }

            ArrayList<Course> remainingCourses = AdvisorLanding.viewingStudent.getCoursesRemaining();
            stringBuilderCourse.append("\n");
            for (Course course : remainingCourses) {
                stringBuilderCourse.append(("\t") + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
            }

            // Set the accumulated text to the Text element
            outputText.setText(stringBuilder.toString());
            courseToTake.setText(stringBuilderCourse.toString());
        }

        private void addNoteToStudent() {
            if (AdvisorLogin.currentAdvisor != null && AdvisorLanding.viewingStudent != null) {
                String notes = notesTextArea.getText();
                System.out.println(notes);
                System.out.println(AdvisorLanding.viewingStudent.getUserName());

                AdvisorLogin.currentAdvisor.students = new ArrayList<Student>();
                AdvisorLogin.currentAdvisor.students.add(AdvisorLanding.viewingStudent);
                AdvisorLogin.currentAdvisor.addStudentNotes(AdvisorLanding.viewingStudent.getUserName(), notes);
            } else {
                System.out.println("Advisor or Student is not logged in.");
            }
        }

    @FXML
    private void addNote() throws IOException {
        addNoteToStudent();
        switchToLogIn();
        // TODO: Add your logic here for user sign-up
    }
    private void switchToLogIn() throws IOException {
        App.setRoot("login_page");
    }
    @FXML
    private void setLanding() throws IOException {
            returnToLanding();
    }
    @FXML
    private void returnToLanding() throws IOException {
            App.setRoot("advisorLanding");
    }

    }

