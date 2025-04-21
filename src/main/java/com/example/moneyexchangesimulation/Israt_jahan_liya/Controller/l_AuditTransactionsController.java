package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.AuditReport;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class l_AuditTransactionsController
{
    @javafx.fxml.FXML
    private TextField endDateField;
    @javafx.fxml.FXML
    private Label auditStatusLabel;
    @javafx.fxml.FXML
    private Label flaggedLabel;
    @javafx.fxml.FXML
    private TextField startDateField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitAuditButton(ActionEvent actionEvent) {
        String start = startDateField.getText();
        String end = endDateField.getText();

        if (start.isEmpty() || end.isEmpty()) {
            flaggedLabel.setText("Please enter both dates.");
            return;
        }

        // Fake logic: flag if start date starts with "01" or end date ends with "31"
        boolean flagged = start.startsWith("01") || end.endsWith("31");

        String status = flagged ? "Escalated: Irregularities Found" : "Audit Passed: No Manipulation";

        AuditReport currentReport = new AuditReport(start, end, flagged, status);

        flaggedLabel.setText(flagged ? "Flagged" : "Not Flagged");
        auditStatusLabel.setText(currentReport.getAuditStatus());
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) {
    }
}