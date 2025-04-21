package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import javax.imageio.IIOException;
import java.io.IOException;

public class SystemManagerGoal1Controller
{
    @javafx.fxml.FXML
    private Label serverStatusLabel;
    @javafx.fxml.FXML
    private Label takeActionl;
    @javafx.fxml.FXML
    private Label uptimeLabel;
    @javafx.fxml.FXML
    private TextArea securityReportArea;

    private boolean issueFound = false;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void takeAction(ActionEvent actionEvent) {
        if (issueFound) {
            takeActionl.setText("Issues resolved: SSL updated & passwords reset.");
            issueFound = false;
        } else {
            takeActionl.setText("System is already secure.");
        }
    }

    @javafx.fxml.FXML
    public void runSecurityCheck(ActionEvent actionEvent) {
        issueFound = true;
        securityReportArea.setText("Security Check Report:\n- Outdated SSL Cert\n- Weak Password Detected");
        takeActionl.setText("Issues found. Please take action.");
    }

    @javafx.fxml.FXML
    public void checkUptime(ActionEvent actionEvent) {
        uptimeLabel.setText("Uptime: 99.98%");
        serverStatusLabel.setText("Server Status: Running Smoothly");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerDashboard");
    }
}