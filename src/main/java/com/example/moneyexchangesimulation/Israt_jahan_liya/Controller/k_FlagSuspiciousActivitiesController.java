package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.AuditReport;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class k_FlagSuspiciousActivitiesController
{
    @javafx.fxml.FXML
    private TextField endDateField;
    @javafx.fxml.FXML
    private Label auditStatusLabel;
    @javafx.fxml.FXML
    private Label flaggedLabel;
    @javafx.fxml.FXML
    private TextField startDateField;

    private AuditReport currentReport;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitAuditButton(ActionEvent actionEvent) {
        if (currentReport == null) {
            auditStatusLabel.setText("No audit report to submit.");
            return;
        }

        String result = currentReport.isFlagged() ? "Report Escalated to Management" : "Audit Completed Successfully";
        currentReport.setAuditStatus(result);
        auditStatusLabel.setText(result);
    }

    @javafx.fxml.FXML
    public void compileAuditButton(ActionEvent actionEvent) {
        String start = startDateField.getText();
        String end = endDateField.getText();

        if (start.isEmpty() || end.isEmpty()) {
            flaggedLabel.setText("Please enter both dates.");
            return;
        }

        // Simulate system flagging based on fake logic
        boolean flagged = start.startsWith("01") || end.endsWith("31");

        currentReport = new AuditReport(start, end, flagged, "");
        flaggedLabel.setText(flagged ? "Irregularities Found" : "All Transactions Normal");
    }
}