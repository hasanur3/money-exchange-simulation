package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import java.io.IOException;

public class BusinessOwnerGoal5Controller
{
    @javafx.fxml.FXML
    private Label genarateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private Label shareLabel;
    @javafx.fxml.FXML
    private Label downloadLabel;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Revenue", "Expenses", "Net Profit");
        genarateLabel.setText("");
        shareLabel.setText("");
        downloadLabel.setText("");
    }

    @javafx.fxml.FXML
    public void logout(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void download(ActionEvent actionEvent) {
        String selectedReport = reportTypeComboBox.getValue();

        if (selectedReport == null || selectedReport.isEmpty()) {
            downloadLabel.setText("Select report type to download.");
        } else {
            downloadLabel.setText(selectedReport + " report downloaded.");
        }

    }

    @javafx.fxml.FXML
    public void share(ActionEvent actionEvent) {
        String selectedReport = reportTypeComboBox.getValue();

        if (selectedReport == null || selectedReport.isEmpty()) {
            shareLabel.setText("Select report type to share.");
        } else {
            shareLabel.setText(selectedReport + " report shared with advisor.");
        }
    }

    @javafx.fxml.FXML
    public void financialReport(ActionEvent actionEvent) {
        String selectedReport = reportTypeComboBox.getValue();

        if (selectedReport == null || selectedReport.isEmpty()) {
            genarateLabel.setText("Please select a report type.");
        } else {
            genarateLabel.setText(selectedReport + " report generated successfully.");
        }
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerDashboard");

    }
}