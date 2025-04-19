package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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
}