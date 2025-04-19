package com.example.moneyexchangesimulation.Hasan;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class SystemManagerGoal8Controller
{
    @javafx.fxml.FXML
    private ListView<String> backupListView;
    @javafx.fxml.FXML
    private Label otpLabel;
    @javafx.fxml.FXML
    private Label restoreStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        backupListView.setItems(FXCollections.observableArrayList(
                "Backup_2024-04-01.bak",
                "Backup_2024-04-05.bak",
                "Backup_2024-04-10.bak"
        ));
    }

    @javafx.fxml.FXML
    public void restoreData(ActionEvent actionEvent) {
        String selected = backupListView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            restoreStatusLabel.setText("System restored successfully from: " + selected);
        } else {
            restoreStatusLabel.setText("Please select a backup to restore.");
        }
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("systemManagerDashboard");
    }
}