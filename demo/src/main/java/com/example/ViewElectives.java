package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import lib.Course;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.layout.VBox;
import lib.CourseAttributes;
import lib.Student;

public class ViewElectives extends App{

    @FXML
    private Text successAdd;

    @FXML
    private Text FailedToAdd;

    @FXML
    private Button addCourseButton;

    @FXML
    private Text promtNumber;

    @FXML
    private Text promtCode;

    @FXML
    private TextField courseCode;

    @FXML
    private TextField courseNumber;

    @FXML
    private Text elecType;

    @FXML
    private Text elecClass;


    @FXML
    private void gssSelect() {
        courseCode.setVisible(false);
        courseNumber.setVisible(false);
        promtCode.setVisible(false);
        promtNumber.setVisible(false);
        addCourseButton.setVisible(false);
        elecClass.setVisible(true);
        FailedToAdd.setVisible(false);
        successAdd.setVisible(false);
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     GSS Electives");
        ArrayList<Course> gssCourses = facade.courseList.getGSS();
        for (Course course : gssCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void ghsSelect() {
        courseCode.setVisible(false);
        courseNumber.setVisible(false);
        promtCode.setVisible(false);
        promtNumber.setVisible(false);
        addCourseButton.setVisible(false);
        elecClass.setVisible(true);
        FailedToAdd.setVisible(false);
        successAdd.setVisible(false);
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     GHS Electives");
        ArrayList<Course> ghsCourses = facade.courseList.getGHS();
        for (int i = 1; i < ghsCourses.size(); i++)
            stringBuilder.append("\n" + " " + ghsCourses.get(i).getCourseCode() + " " + ghsCourses.get(i).getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void infSelect() {
        courseCode.setVisible(false);
        courseNumber.setVisible(false);
        promtCode.setVisible(false);
        promtNumber.setVisible(false);
        addCourseButton.setVisible(false);
        elecClass.setVisible(true);
        FailedToAdd.setVisible(false);
        successAdd.setVisible(false);
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     INF Electives");
        ArrayList<Course> infCourses = facade.courseList.getINF();
        for (Course course : infCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void aiuSelect() {
        courseCode.setVisible(false);
        courseNumber.setVisible(false);
        promtCode.setVisible(false);
        promtNumber.setVisible(false);
        addCourseButton.setVisible(false);
        FailedToAdd.setVisible(false);
        elecClass.setVisible(true);
        successAdd.setVisible(false);
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     AIU Electives");
        ArrayList<Course> aiuCourses = facade.courseList.getAIU();
        for (Course course : aiuCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void cmsSelect() {
        courseCode.setVisible(false);
        courseNumber.setVisible(false);
        promtCode.setVisible(false);
        promtNumber.setVisible(false);
        addCourseButton.setVisible(false);
        elecClass.setVisible(true);
        FailedToAdd.setVisible(false);
        successAdd.setVisible(false);
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     CMS Electives");
        ArrayList<Course> cmsCourses = facade.courseList.getCMS();
        for (Course course : cmsCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void gflSelect() {
        courseCode.setVisible(false);
        courseNumber.setVisible(false);
        promtCode.setVisible(false);
        promtNumber.setVisible(false);
        addCourseButton.setVisible(false);
        elecClass.setVisible(true);
        FailedToAdd.setVisible(false);
        successAdd.setVisible(false);
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     GFL Electives");
        ArrayList<Course> gflCourses = facade.courseList.getGFL();
        for (int i = 1; i < gflCourses.size(); i++)
            stringBuilder.append("\n" + " " + gflCourses.get(i).getCourseCode() + " " + gflCourses.get(i).getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void addACourse() {
        elecType.setText("\t     Add A Course");
        courseCode.setVisible(true);
        courseNumber.setVisible(true);
        promtCode.setVisible(true);
        promtNumber.setVisible(true);
        addCourseButton.setVisible(true);
        elecClass.setVisible(false);
        FailedToAdd.setVisible(false);
        successAdd.setVisible(false);
    }

    @FXML
    private void addCourseInput() {
        String code = courseCode.getText().toUpperCase();
        String number = courseNumber.getText();
        for(Course course : StudentLogin.currentStudent.getMajor().courses) {
            if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                FailedToAdd.setVisible(true);
                successAdd.setVisible(false);
                return;
            }
        }
        int gflIndex = -1;
        for (int i = 0; i < StudentLogin.currentStudent.getMajor().courses.size(); i++) {
            Course course = StudentLogin.currentStudent.getMajor().courses.get(i);
            if (course.getCourseCode().equals("GFL Elective")) {
                gflIndex = i;
                break;
            }
        }
        if (gflIndex != -1) {
            for (Course course : facade.courseList.Courses) {
                if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                    if (Course.isGFL(course)) {
                        // If the course is found, replace the GFL elective with the new course
                        StudentLogin.currentStudent.getMajor().courses.set(gflIndex, course);
                        System.out.println("Course successfully added and replaced the GFL elective.");
                        courseCode.clear();
                        courseNumber.clear();
                        FailedToAdd.setVisible(false);
                        successAdd.setVisible(true);
                        return; // Exit the method once the course is added
                    } else {
                        StudentLogin.currentStudent.getMajor().courses.add(course);
                        FailedToAdd.setVisible(false);
                        successAdd.setVisible(true);
                        courseCode.clear();
                        courseNumber.clear();
                        System.out.println("Course successfully added");
                    }
                }
            }
            System.out.println("Course not found.");
            FailedToAdd.setVisible(true);
            successAdd.setVisible(false);
        } else {
            for (Course course : facade.courseList.Courses) {
                if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                    StudentLogin.currentStudent.getMajor().courses.add(course);
                    System.out.println("Course successfully added");
                    courseCode.clear();
                    courseNumber.clear();
                    successAdd.setVisible(true);
                    FailedToAdd.setVisible(false);
                }
            }
        }
    }

    @FXML
    private void returnToOverview() throws IOException {
        switchToOverview();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToOverview() throws IOException {
        App.setRoot("studentOverview");
    }
}
