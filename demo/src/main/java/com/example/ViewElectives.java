package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import lib.Course;

import java.io.IOException;
import java.util.ArrayList;

public class ViewElectives extends App{

    @FXML
    private Button GSS;

    @FXML
    private Button INF;

    @FXML
    private Button GHS;

    @FXML
    private Button GFL;

    @FXML
    private Button AIU;

    @FXML
    private Button CMS;

    @FXML
    private Text elecType;

    @FXML
    private Text elecClass;

    @FXML
    private void gssSelect() {
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     GSS Electives");
        ArrayList<Course> gssCourses = facade.courseList.getGSS();
        for (Course course : gssCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void ghsSelect() {
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     GHS Electives");
        ArrayList<Course> ghsCourses = facade.courseList.getGHS();
        for (int i = 1; i < ghsCourses.size(); i++)
            stringBuilder.append("\n" + " " + ghsCourses.get(i).getCourseCode() + " " + ghsCourses.get(i).getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void infSelect() {
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     INF Electives");
        ArrayList<Course> infCourses = facade.courseList.getINF();
        for (Course course : infCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void aiuSelect() {
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     AIU Electives");
        ArrayList<Course> aiuCourses = facade.courseList.getAIU();
        for (Course course : aiuCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void cmsSelect() {
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     CMS Electives");
        ArrayList<Course> cmsCourses = facade.courseList.getCMS();
        for (Course course : cmsCourses)
            stringBuilder.append("\n" + " " + course.getCourseCode() + " " + course.getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void gflSelect() {
        StringBuilder stringBuilder = new StringBuilder();
        elecType.setText("\t     GFL Electives");
        ArrayList<Course> gflCourses = facade.courseList.getGFL();
        for (int i = 1; i < gflCourses.size(); i++)
            stringBuilder.append("\n" + " " + gflCourses.get(i).getCourseCode() + " " + gflCourses.get(i).getCourseNumber() + "\n");
        elecClass.setText(stringBuilder.toString());
    }

    @FXML
    private void returnToOverview() throws IOException {
        switchtoOverview();;
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchtoOverview() throws IOException {
        App.setRoot("studentOverview");

    }
}
