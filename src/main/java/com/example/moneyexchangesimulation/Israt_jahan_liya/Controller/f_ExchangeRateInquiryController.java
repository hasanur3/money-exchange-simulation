package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.ExchangeRateInquiry;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class f_ExchangeRateInquiryController
{
    @javafx.fxml.FXML
    private Label trendLabel;
    @javafx.fxml.FXML
    private Label currentRateLabel;
    @javafx.fxml.FXML
    private ComboBox<String> currencyTypeComboBox;
    @javafx.fxml.FXML
    private TextField amountField;

    @javafx.fxml.FXML
    public void initialize() {
        currencyTypeComboBox.getItems().addAll("USD", "EUR", "BDT");
    }

    @javafx.fxml.FXML
    public void getRateInfoButton(ActionEvent actionEvent) {
        String currency = currencyTypeComboBox.getValue();
        String amountText = amountField.getText();

        if (currency != null && !amountText.isEmpty()) {
            try {
                double amount = Double.parseDouble(amountText);
                ExchangeRateInquiry inquiry = new ExchangeRateInquiry(currency, amount);

                // Simulated logic
                String rate = "1 " + currency + " = " + getRate(currency) + " BDT";
                String trend = getTrend(currency);

                currentRateLabel.setText(rate);
                trendLabel.setText(trend);
            } catch (NumberFormatException e) {
                currentRateLabel.setText("Invalid amount");
                trendLabel.setText("");
            }
        } else {
            currentRateLabel.setText("Please select currency and enter amount");
            trendLabel.setText("");
        }
    }

    private String getRate(String currency) {
        return switch (currency) {
            case "USD" -> "110.5";
            case "EUR" -> "119.7";
            case "BDT" -> "1.0";
            default -> "Unknown";
        };
    }

    private String getTrend(String currency) {
        return switch (currency) {
            case "USD" -> "USD rising, good time to exchange.";
            case "EUR" -> "EUR stable, monitor closely.";
            case "BDT" -> "BDT local baseline.";
            default -> "No trend data.";
        };
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}