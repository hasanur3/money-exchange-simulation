package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemManagerGoal4Controller
{
    @javafx.fxml.FXML
    private ComboBox<String> filterCombo;
    @javafx.fxml.FXML
    private TextArea logArea;
    @javafx.fxml.FXML
    private TextField filterField;
    @javafx.fxml.FXML
    private Label statusLabel;

    private List<String> logs = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        filterCombo.getItems().addAll("Date", "User", "Action");

        logs.add("2025-04-12 | User: admin | Login Success");
        logs.add("2025-04-12 | User: cashier | Failed Login Attempt");
        logs.add("2025-04-12 | User: cashier | Large Transaction: $250,000");
        logs.add("2025-04-13 | User: system Manager | System Update");

        showLogs(logs);
    }

    private void showLogs(List<String> logsToShow) {
        logArea.clear();
        for (String log : logsToShow) {
            logArea.appendText(log + "\n");
        }
    }

    @javafx.fxml.FXML
    public void applyFilter(ActionEvent actionEvent) {
        String type = filterCombo.getValue();
        String keyword = filterField.getText().toLowerCase();

        if (type == null || keyword.isEmpty()) {
            statusLabel.setText("Please select filter and enter a value.");
            return;
        }

        List<String> filtered = new ArrayList<>();
        for (String log : logs) {
            if (log.toLowerCase().contains(keyword)) {
                filtered.add(log);
            }
        }

        showLogs(filtered);
        statusLabel.setText(filtered.isEmpty() ? "No matching logs." : "");
    }

    @javafx.fxml.FXML
    public void flagIssue(ActionEvent actionEvent) {
        statusLabel.setText("Issue flagged. Security team alerted.");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerDashboard");
    }
}