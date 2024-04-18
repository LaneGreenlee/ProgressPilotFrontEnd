package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lib.*;

/**
 * JavaFX App
 */
public class App extends Application {

    public ProgessPilotFACADE facade = new ProgessPilotFACADE();

    public static ArrayList<Student> students = new ArrayList<>();
    public static ArrayList<Advisor> advisors = new ArrayList<>();
    public static ArrayList<Course> courses = new ArrayList<>();


    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("login_page"), 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        setup();
        launch();
    }

    public static void setup() {
        UserList userList = new UserList();
        courses = DataLoader.getCourses("demo/src/main/java/data/course_ex.json");
        students = DataLoader.getAllStudents("demo/src/main/java/data/student_ex.json");
        advisors = DataLoader.getAllAdvisors("demo/src/main/java/data/admin_ex.json");
    }
}