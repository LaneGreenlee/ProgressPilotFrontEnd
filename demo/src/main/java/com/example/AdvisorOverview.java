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

            StudentLogin.currentStudent = facade.studentLogin("Brax", "West");

            studentName.setText("Viewing: " + StudentLogin.currentStudent.getFirstName() + " " + StudentLogin.currentStudent.getLastName());
            // Iterate over the HashMap entries and append key-value pairs to the StringBuilder
            for (Map.Entry<Course, Grade> entry : StudentLogin.currentStudent.completedCourses.entrySet()) {
                stringBuilder.append(("\tCourse Name: ") + entry.getKey().getCourseCode() + (" ") +entry.getKey().getCourseNumber()+ ("\t, Grade: ") + entry.getValue() + ("\n"));
            }

            ArrayList<Course> remainingCourses = StudentLogin.currentStudent.getCoursesRemaining();

            for (Course course : remainingCourses) {
                stringBuilderCourse.append(("\t") + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
            }

            // Set the accumulated text to the Text element
            outputText.setText(stringBuilder.toString());
            courseToTake.setText(stringBuilderCourse.toString());
        }

        private void addNoteToStudent() {
            if (AdvisorLogin.currentAdvisor != null && StudentLogin.currentStudent != null) {
                String notes = notesTextArea.getText();
                System.out.println(notes);
                System.out.println(StudentLogin.currentStudent.getUserName());

                AdvisorLogin.currentAdvisor.students = new ArrayList<Student>();
                AdvisorLogin.currentAdvisor.students.add(StudentLogin.currentStudent);
                AdvisorLogin.currentAdvisor.addStudentNotes(StudentLogin.currentStudent.getUserName(), notes);
            } else {
                // Handle the case when AdvisorLogin.currentAdvisor or StudentLogin.currentStudent is null
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
    }

