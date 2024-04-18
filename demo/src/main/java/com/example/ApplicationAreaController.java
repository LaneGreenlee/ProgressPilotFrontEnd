package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.CheckBox;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.IntegerBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import lib.ApplicationArea;
import lib.Course;
import lib.CourseList;

import static com.example.StudentLogin.currentStudent;

public class ApplicationAreaController extends App {

    private CourseList courseList = CourseList.getInstance();

    @FXML
    private CheckBox checkbox1;

    @FXML
    private CheckBox checkbox2;

    @FXML
    private CheckBox checkbox3;

    @FXML
    private CheckBox checkbox4;

    @FXML
    private CheckBox checkbox5;

    @FXML
    private RadioButton computerGameRB;

    @FXML
    private RadioButton geoInfoRB;

    @FXML
    private RadioButton cloudNatRB;

    @FXML
    private RadioButton dataRB;

    @FXML
    private RadioButton bioInfoRB;

    @FXML
    private RadioButton roboticsRB;

    @FXML
    private RadioButton newMediaRB;

    @FXML
    private RadioButton linguisticsRB;

    @FXML
    private RadioButton riskAndInsuranceRB;

    @FXML
    private RadioButton aeroRB;

    @FXML
    private RadioButton cyberRB;

    @FXML
    private void selectComputerGame() {
        if (computerGameRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectCloudNat() {
        if (cloudNatRB.isSelected()) {
            computerGameRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectGeoInfo() {
        if (geoInfoRB.isSelected()) {
            cloudNatRB.setSelected(false);
            computerGameRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectData() {
        if (dataRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            computerGameRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectBioInfo() {
        if (bioInfoRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            computerGameRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectRobotics() {
        if (roboticsRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            computerGameRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectNewMedia() {
        if (newMediaRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            computerGameRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectLinguistics() {
        if (linguisticsRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            computerGameRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectRiskAndInsurance() {
        if (riskAndInsuranceRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            computerGameRB.setSelected(false);
            aeroRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectAero() {
        if (aeroRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            computerGameRB.setSelected(false);
            cyberRB.setSelected(false);
        }
    }
    @FXML
    private void selectCyber() {
        if (cyberRB.isSelected()) {
            cloudNatRB.setSelected(false);
            geoInfoRB.setSelected(false);
            dataRB.setSelected(false);
            bioInfoRB.setSelected(false);
            roboticsRB.setSelected(false);
            newMediaRB.setSelected(false);
            linguisticsRB.setSelected(false);
            riskAndInsuranceRB.setSelected(false);
            aeroRB.setSelected(false);
            computerGameRB.setSelected(false);
        }
    }

    @FXML
    private void selectAppArea() {
        makeVisible();
        if (computerGameRB.isSelected()) {
            checkbox1.setText("MART 201");
            checkbox2.setText("MART 210");
            checkbox3.setText("MART 380");
            checkbox4.setText("MART 371");
            checkbox5.setText("MATH 527");
        } else if (riskAndInsuranceRB.isSelected()) {
            checkbox1.setText("FINA 341");
            checkbox2.setText("FINA 363");
            checkbox3.setText("FINA 442");
            checkbox4.setText("FINA 443");
            checkbox5.setText("FINA 444");
        }else if (cyberRB.isSelected()) {
            checkbox1.setText("CRJU 313");
            checkbox2.setText("CRJU 314");
            checkbox3.setText("LAWS 525");
            checkbox4.setText("LAWS 526");
            checkbox5.setText("JOUR 303");
        }else if (cloudNatRB.isSelected()) {
            checkbox1.setText("MGMT 371");
            checkbox2.setText("MGMT 374");
            checkbox3.setText("MGMT 376");
            checkbox4.setText("MGMT 402");
            checkbox5.setText("MGMT 403");
        }else if (geoInfoRB.isSelected()) {
            checkbox1.setText("GEOG 341");
            checkbox2.setText("GEOG 345");
            checkbox3.setText("GEOG 363");
            checkbox4.setText("GEOG 541");
            checkbox5.setText("GEOG 551");
        }else if (bioInfoRB.isSelected()) {
            checkbox1.setText("BIOL 301");
            checkbox2.setText("BIOL 302");
            checkbox3.setText("BIOL 303");
            checkbox4.setText("CHEM 333");
            checkbox5.setVisible(false);
        }else if (roboticsRB.isSelected()) {
            checkbox1.setText("EMCH 535");
            checkbox2.setText("ELCT 331");
            checkbox3.setText("ELCT 531");
            checkbox4.setVisible(false);
            checkbox5.setVisible(false);
        }else if (newMediaRB.isSelected()) {
            checkbox1.setText("MART 201");
            checkbox2.setText("MART 210");
            checkbox3.setText("MART 371");
            checkbox4.setText("MART 380");
            checkbox5.setVisible(false);
        }else if (linguisticsRB.isSelected()) {
            checkbox1.setText("LING 340");
            checkbox2.setText("LING 421");
            checkbox3.setText("LING 440");
            checkbox4.setText("LING 565");
            checkbox5.setText("LING 567");
        }else if (aeroRB.isSelected()) {
            checkbox1.setText("EMCH 557");
            checkbox2.setText("EMCH 578");
            checkbox3.setText("EMCH 508");
            checkbox4.setText("EMCH 585");
            checkbox5.setVisible(false);
        }else if (dataRB.isSelected()) {
            checkbox1.setText("STAT 511");
            checkbox2.setText("STAT 512");
            checkbox3.setText("STAT 513");
            checkbox4.setText("STAT 530");
            checkbox5.setText("STAT 535");
        }else{

        }
    }

    private ObservableSet<CheckBox> selectedCheckBoxes = FXCollections.observableSet();
    private ObservableSet<CheckBox> unselectedCheckBoxes = FXCollections.observableSet();

    private IntegerBinding numCheckBoxesSelected = Bindings.size(selectedCheckBoxes);

    private final int maxNumSelected =  3;

    @FXML
    private void handleCheckboxAction() {
        // Call your methods here
        configureCheckBox(checkbox1);
        configureCheckBox(checkbox2);
        configureCheckBox(checkbox3);
        configureCheckBox(checkbox4);
        configureCheckBox(checkbox5);
    }
    public void initialize() {
     handleCheckboxAction();
        numCheckBoxesSelected.addListener((obs, oldSelectedCount, newSelectedCount) -> {
            if (newSelectedCount.intValue() >= maxNumSelected) {
                unselectedCheckBoxes.forEach(cb -> cb.setDisable(true));
            } else {
                unselectedCheckBoxes.forEach(cb -> cb.setDisable(false));
            }
        });


    }

    private void configureCheckBox(CheckBox checkBox) {

        if (checkBox.isSelected()) {
            selectedCheckBoxes.add(checkBox);
        } else {
            unselectedCheckBoxes.add(checkBox);
        }

        checkBox.selectedProperty().addListener((obs, wasSelected, isNowSelected) -> {
            if (isNowSelected) {
                unselectedCheckBoxes.remove(checkBox);
                selectedCheckBoxes.add(checkBox);
            } else {
                selectedCheckBoxes.remove(checkBox);
                unselectedCheckBoxes.add(checkBox);
            }

        });

    }
    private String code;
    private String number;
    private ArrayList<Course> apCourses = new ArrayList<>();
    @FXML
    private void setAppClasses() {
            if (checkbox1.isSelected()) {
                code = "CRJU";
                number = "313";
                System.out.println("Got here");
                for (Course course : facade.courseList.Courses) {
                    if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                        apCourses.add(course);
                        System.out.println("Added");
                    }
                }
                checkbox1.setSelected(false);
            }
            if (checkbox2.isSelected()) {
                code = "CRJU";
                number = "314";
                for (Course course : facade.courseList.Courses) {
                    if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                        apCourses.add(course);
                        System.out.println("Added");
                    }
                }
                checkbox2.setSelected(false);
            }
            if (checkbox3.isSelected()) {
                code = "LAWS";
                number = "525";
                int up = 1;
                for (Course course : facade.courseList.Courses) {
                    if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                        apCourses.add(course);
                        System.out.println("Added");
                    }
                    System.out.println(up++);
                }

                checkbox3.setSelected(false);
            }
            if (checkbox4.isSelected()) {
                code = "LAWS";
                number = "526";
                for (Course course : facade.courseList.Courses) {
                    if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                        apCourses.add(course);
                        System.out.println("Added");
                    }
                }
                checkbox4.setSelected(false);
            }
            if (checkbox5.isSelected()) {
                code = "JOUR";
                number = "303";
                for (Course course : facade.courseList.Courses) {
                    if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                        apCourses.add(course);
                        System.out.println("Added");
                    }
                }
                checkbox5.setSelected(false);
            }
        System.out.println(apCourses);
        for (Course applicationCourses : apCourses) {
            for (int i = 0; i < StudentLogin.currentStudent.getMajor().courses.size(); i++) {
                if (StudentLogin.currentStudent.getMajor().courses.get(i).getCourseCode().equals("Application Area Elective")) {
                    StudentLogin.currentStudent.getMajor().courses.set(i, applicationCourses);
                    break;
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
        App.setRoot("studentLanding");
    }

    private void makeVisible() {
        checkbox1.setVisible(true);
        checkbox2.setVisible(true);
        checkbox3.setVisible(true);
        checkbox4.setVisible(true);
        checkbox5.setVisible(true);
    }

    /*
           String code = courseCode.getText().toUpperCase();
        String number = courseNumber.getText();
        System.out.println(code+number);
        for(Course course : StudentLogin.currentStudent.getMajor().courses) {
            if (code.equals(course.getCourseCode()) && number.equals(course.getCourseNumber())) {
                successAdd.setVisible(false);
                FailedToAdd.setVisible(true);
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
            successAdd.setVisible(false);
            FailedToAdd.setVisible(true);
        }
     */
}
