package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class o_ReviewAlertsController
{
    @javafx.fxml.FXML
    private Label resolutionStatusLabel;
    @javafx.fxml.FXML
    private TextField alertDetailsArea;
    @javafx.fxml.FXML
    private TextField actionTakenField;
    @javafx.fxml.FXML
    private TextField alertIdField;

    @javafx.fxml.FXML
    public void initialize() {
        resolutionStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void resolveButton(ActionEvent actionEvent) {
        String id = alertIdField.getText();
        String action = actionTakenField.getText();

        if (!id.isEmpty() && !action.isEmpty()) {
            resolutionStatusLabel.setText("Alert ID " + id + " resolved with action: " + action);
        } else {
            resolutionStatusLabel.setText("Please fill in all fields.");
        }
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}