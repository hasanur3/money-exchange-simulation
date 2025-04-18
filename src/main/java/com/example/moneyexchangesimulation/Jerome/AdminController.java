package com.example.moneyexchangesimulation.Jerome;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;

public class AdminController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleManageUsers(ActionEvent actionEvent) {
        showInfo("Manage Users clicked.");
    }

    @javafx.fxml.FXML
    public void handleSetExchangeRates(ActionEvent actionEvent) {
        showInfo("Setting exchange rates...");
    }

    @javafx.fxml.FXML
    public void handleCustomerSupport(ActionEvent actionEvent) {
        showInfo("Handling customer support...");
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) {
        showInfo("Logged out successfully.");
    }

    @javafx.fxml.FXML
    public void handleReviewReports(ActionEvent actionEvent) {
        showInfo("Reviewing reports...");
    }

    @javafx.fxml.FXML
    public void handleMonitorTransactions(ActionEvent actionEvent) {
        showInfo("Monitoring transactions...");
    }

    private void showInfo(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Admin Action");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}