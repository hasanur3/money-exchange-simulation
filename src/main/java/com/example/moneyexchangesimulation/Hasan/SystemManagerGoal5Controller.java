package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class SystemManagerGoal5Controller
{
    @javafx.fxml.FXML
    private Label installStatusLabel;
    @javafx.fxml.FXML
    private Label updatestatusLabel;

    private boolean updateAvailable = false;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void checkForUpdates(ActionEvent actionEvent) {
        updateAvailable = true;
        updatestatusLabel.setText("✅ Update available: Version 2.1.0");
        installStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void installUpdate(ActionEvent actionEvent) {
        if (updateAvailable) {
            installStatusLabel.setText("✅ System Updated Successfully!");
            updateAvailable = false;
        } else {
            installStatusLabel.setText("ℹ️ No update available to install.");
        }
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("systemManagerDashboard");
    }
}