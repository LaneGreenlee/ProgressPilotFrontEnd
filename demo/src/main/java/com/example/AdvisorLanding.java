package com.example;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.text.*;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import lib.Advisor;
import lib.Student;
import lib.UserList;

import java.io.IOException;
import java.util.ArrayList;

public class AdvisorLanding extends App {
    public static Student viewingStudent;
    @FXML
    private RadioButton student1;
    @FXML
    private RadioButton student2;
    @FXML
    private RadioButton student3;
    @FXML
    private RadioButton student4;
    @FXML
    private RadioButton student5;
    @FXML
    private TextField ID;
    @FXML
    private Text URL;
    @FXML
    public void initialize() {
        // Calculate text size based on rectangle width
        // Set font size for each Text element
        Font umlFont = new Font(50);
        TextAlignment urlAlignment = TextAlignment.RIGHT;
        AdvisorLogin.currentAdvisor.students = new ArrayList<Student>();
        AdvisorLogin.currentAdvisor.students.add(facade.studentLogin("Brax", "West"));
        //URL.setFont(umlFont);
        //URL.setTextAlignment(urlAlignment);
        radioButton();

    }
    @FXML
    private void radioButton() {
        student1.setVisible(false);
        student2.setVisible(false);
        student3.setVisible(false);
        student4.setVisible(false);
        student5.setVisible(false);
        int size = AdvisorLogin.currentAdvisor.students.size();
        System.out.println(size);
        System.out.println(AdvisorLogin.currentAdvisor.students);

        if (size == 1) {
            student1.setVisible(true);
            student1.setText(AdvisorLogin.currentAdvisor.students.get(0).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(0).getLastName());
        }
        else if (size == 2) {
            student1.setVisible(true);
            student2.setVisible(true);
            student1.setText(AdvisorLogin.currentAdvisor.students.get(0).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(0).getLastName());
            student2.setText(AdvisorLogin.currentAdvisor.students.get(1).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(1).getLastName());
        }
        else if (size == 3) {
            student1.setVisible(true);
            student2.setVisible(true);
            student3.setVisible(true);
            student1.setText(AdvisorLogin.currentAdvisor.students.get(0).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(0).getLastName());
            student2.setText(AdvisorLogin.currentAdvisor.students.get(1).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(1).getLastName());
            student3.setText(AdvisorLogin.currentAdvisor.students.get(2).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(2).getLastName());
        }
        else if (size == 4) {
            student1.setVisible(true);
            student2.setVisible(true);
            student3.setVisible(true);
            student4.setVisible(true);
            student1.setText(AdvisorLogin.currentAdvisor.students.get(0).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(0).getLastName());
            student2.setText(AdvisorLogin.currentAdvisor.students.get(1).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(1).getLastName());
            student3.setText(AdvisorLogin.currentAdvisor.students.get(2).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(2).getLastName());
            student4.setText(AdvisorLogin.currentAdvisor.students.get(3).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(3).getLastName());
        }
        else if (size == 5) {
            student1.setVisible(true);
            student2.setVisible(true);
            student3.setVisible(true);
            student4.setVisible(true);
            student5.setVisible(true);
            student1.setText(AdvisorLogin.currentAdvisor.students.get(0).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(0).getLastName());
            student2.setText(AdvisorLogin.currentAdvisor.students.get(1).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(1).getLastName());
            student3.setText(AdvisorLogin.currentAdvisor.students.get(2).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(2).getLastName());
            student4.setText(AdvisorLogin.currentAdvisor.students.get(3).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(3).getLastName());
            student5.setText(AdvisorLogin.currentAdvisor.students.get(4).getFirstName() + " " + AdvisorLogin.currentAdvisor.students.get(4).getLastName());
        }

    }
    @FXML
    private void addStudent() {
        String adviseeID = ID.getText();
        AdvisorLogin.currentAdvisor.addStudentByID(adviseeID);
        radioButton();
        ID.clear();
    }

    @FXML
    private void radio1Select() {
        if (student1.isSelected()) {
            student2.setSelected(false);
            student3.setSelected(false);
            student4.setSelected(false);
            student5.setSelected(false);
        }
    }
    @FXML
    private void radio2Select() {
        if (student2.isSelected()) {
        student1.setSelected(false);
        student3.setSelected(false);
        student4.setSelected(false);
        student5.setSelected(false);
    }
    }
    @FXML
    private void radio3Select() {
        if (student3.isSelected()) {
            student1.setSelected(false);
            student2.setSelected(false);
            student4.setSelected(false);
            student5.setSelected(false);
        }
    }
    @FXML
    private void radio4Select() {
        if (student4.isSelected()) {
            student1.setSelected(false);
            student2.setSelected(false);
            student3.setSelected(false);
            student5.setSelected(false);
        }
    }
    @FXML
    private void radio5Select() {
        if (student5.isSelected()) {
            student1.setSelected(false);
            student2.setSelected(false);
            student3.setSelected(false);
            student4.setSelected(false);
        }
    }
    @FXML
    private void setStudent() throws IOException {
        if (student1.isSelected()) {
           viewingStudent = AdvisorLogin.currentAdvisor.students.get(0);
        }
        else if (student2.isSelected()) {
            viewingStudent = AdvisorLogin.currentAdvisor.students.get(1);
        }
        else if (student3.isSelected()) {
            viewingStudent = AdvisorLogin.currentAdvisor.students.get(2);
        }
        else if (student4.isSelected()) {
            viewingStudent = AdvisorLogin.currentAdvisor.students.get(3);
        }
        else if (student5.isSelected()) {
            viewingStudent = AdvisorLogin.currentAdvisor.students.get(4);
        }
        switchToOverview();
    }
    @FXML
    private void switchToOverview() throws IOException {
        switchToLanding();
    }
    @FXML
    private void switchToLanding() throws IOException {
        App.setRoot("advisorOverview");
    }


}
