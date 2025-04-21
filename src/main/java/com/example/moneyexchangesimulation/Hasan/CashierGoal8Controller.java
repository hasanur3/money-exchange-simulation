package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class CashierGoal8Controller
{
    @javafx.fxml.FXML
    private TextArea reportArea;
    @javafx.fxml.FXML
    private Label confirmationLabel;

    private String generatedReport = "";

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void generateDatlyReport(ActionEvent actionEvent) {
        generatedReport = """
                Date: %s
                
                Total Transactions: 42
                Total Refunds: 3
                Corrections: 1
                Total Amount Exchanged: BDT 4,20,000
                """.formatted(LocalDateTime.now().withNano(0));

        reportArea.setText(generatedReport);
        confirmationLabel.setText("Report Generated");
    }

    @javafx.fxml.FXML
    public void exportLog(ActionEvent actionEvent) {
        if (generatedReport.isEmpty()) {
            confirmationLabel.setText("Please generate report first.");
            return;
        }

        try (FileWriter writer = new FileWriter("EndOfDayReport.txt")) {
            writer.write(generatedReport);
            confirmationLabel.setText("End-of-Day Report Saved!");
        } catch (IOException e) {
            confirmationLabel.setText("Failed to save report.");
        }
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_dashboard");
    }
}