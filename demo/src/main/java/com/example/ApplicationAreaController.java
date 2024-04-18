package com.example;

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
public class ApplicationAreaController {

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

    private int selectedCount = 0;

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
        if (computerGameRB.isSelected()) {

        } else if (riskAndInsuranceRB.isSelected()) {

        }else if (cyberRB.isSelected()) {

        }else if (cloudNatRB.isSelected()) {

        }else if (geoInfoRB.isSelected()) {

        }else if (bioInfoRB.isSelected()) {

        }else if (roboticsRB.isSelected()) {

        }else if (newMediaRB.isSelected()) {

        }else if (linguisticsRB.isSelected()) {

        }else if (aeroRB.isSelected()) {

        }else if (computerGameRB.isSelected()) {

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

    @FXML
    private void returnToOverview() throws IOException {
        switchToOverview();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToOverview() throws IOException {
        App.setRoot("studentLanding");
    }
}
