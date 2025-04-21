package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.FinancialReport;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

public class g_GenerateReportsController
{
    @javafx.fxml.FXML
    private DatePicker endDatePicker;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeComboBox;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeComboBox.getItems().addAll("Transactions", "Revenue", "Summary");
    }

    @javafx.fxml.FXML
    public void generateReportButton(ActionEvent actionEvent) {
        String startDate = startDatePicker.getValue() != null ? startDatePicker.getValue().toString() : "";
        String endDate = endDatePicker.getValue() != null ? endDatePicker.getValue().toString() : "";
        String reportType = reportTypeComboBox.getValue();

        if (!startDate.isEmpty() && !endDate.isEmpty() && reportType != null) {
            FinancialReport report = new FinancialReport(startDate, endDate, reportType);

            // Simulated logic
            String message = "Report Generated: " + report.getReportType() + "\nFrom: " +
                    report.getStartDate() + " To: " + report.getEndDate();
            statusLabel.setText(message);
        } else {
            statusLabel.setText("Please select start date, end date, and report type.");
        }
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) {
    }
}