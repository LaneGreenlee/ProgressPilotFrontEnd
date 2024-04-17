package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;

import java.io.IOException;

public class ApplicationAreaController {
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
    private void returnToOverview() throws IOException {
        switchToOverview();
        // TODO: Add your logic here for user sign-up
    }

    @FXML
    private void switchToOverview() throws IOException {
        App.setRoot("studentOverview");
    }
}
