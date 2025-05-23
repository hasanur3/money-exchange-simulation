package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class p_InvestigateNonComplianceController
{
    @javafx.fxml.FXML
    private TextField customerIdField;
    @javafx.fxml.FXML
    private Label submissionStatusLabel;
    @javafx.fxml.FXML
    private TextArea behaviorSummaryArea;
    @javafx.fxml.FXML
    private TextField investigationOutcomeField;

    @javafx.fxml.FXML
    public void initialize() {
        submissionStatusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void submitReportButton(ActionEvent actionEvent) {

        String id = customerIdField.getText();
        String outcome = investigationOutcomeField.getText();

        if (!id.isEmpty() && !outcome.isEmpty()) {
            submissionStatusLabel.setText("Report submitted for Customer ID: " + id);
        } else {
            submissionStatusLabel.setText("Please fill in all fields.");
        }
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}