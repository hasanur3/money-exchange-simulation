package com.example.moneyexchangesimulation.Jerome;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class AuditController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleValidateKYC(ActionEvent actionEvent) {
        showInfo("Validating KYC documents...");
    }

    @javafx.fxml.FXML
    public void handleComplianceCheck(ActionEvent actionEvent) {
        showInfo("Conducting compliance check...");
    }

    @javafx.fxml.FXML
    public void handleFlagNonCompliance(ActionEvent actionEvent) {
        showInfo("Flagging non-compliant users...");
    }

    @javafx.fxml.FXML
    public void handleTrackFraud(ActionEvent actionEvent) {
        showInfo("Tracking fraud activity...");
    }

    @javafx.fxml.FXML
    public void handleReviewPastAudits(ActionEvent actionEvent) {
        showInfo("Reviewing previous audits...");
    }

    @javafx.fxml.FXML
    public void handleGenerateReport(ActionEvent actionEvent) {
        showInfo("Generating audit report...");
    }

    @javafx.fxml.FXML
    public void handleVerifyLogs(ActionEvent actionEvent) {
        showInfo("Verifying transaction logs...");
    }

    private void showInfo(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Audit Action");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}