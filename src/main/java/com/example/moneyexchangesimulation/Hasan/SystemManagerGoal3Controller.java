package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

public class SystemManagerGoal3Controller
{
    @javafx.fxml.FXML
    private ComboBox<String> frequencyComboBox;
    @javafx.fxml.FXML
    private Label backupStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        frequencyComboBox.getItems().addAll("Daily", "Weekly", "Manual");
    }

    @javafx.fxml.FXML
    public void startBackup(ActionEvent actionEvent) {
        String frequency = frequencyComboBox.getValue();

        if (frequency == null) {
            backupStatusLabel.setText("Please select backup frequency.");
            return;
        }

        backupStatusLabel.setText("Backup Completed Successfully (" + frequency + ")");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) {
    }
}