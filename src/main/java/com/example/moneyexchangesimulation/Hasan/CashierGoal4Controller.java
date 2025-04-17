package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.io.IOException;

public class CashierGoal4Controller
{
    @javafx.fxml.FXML
    private Label requestStatusLabel;
    @javafx.fxml.FXML
    private TextArea cashBalanceArea;
    @javafx.fxml.FXML
    private Label warningLabel;

    private double usd = 2500.0;
    private double eur = 800.0;
    private double gbp = 450.0;

    @javafx.fxml.FXML
    public void initialize() {
        displayCashBalance();
        checkLowBalance();
    }

    private void displayCashBalance() {
        String data = "USD: " + usd + " BDT\n"
                + "EUR: " + eur + " BDT\n"
                + "GBP: " + gbp + " BDT\n";

        cashBalanceArea.setText(data);
    }

    private void checkLowBalance() {
        String warning = "";
        if (usd < 1000) warning += "⚠️ Low balance in USD\n";
        if (eur < 1000) warning += "⚠️ Low balance in EUR\n";
        if (gbp < 1000) warning += "⚠️ Low balance in GBP\n";

        warningLabel.setText(warning);
    }


    @javafx.fxml.FXML
    public void requestMoreCash(ActionEvent actionEvent) {
        requestStatusLabel.setText("✅ Request sent to admin for more cash.");
    }

//    @javafx.fxml.FXML
//    public void goToDashboard(ActionEvent actionEvent) throws IOException {
//        SceneSwitcher.switchTo("cashier_dashboard");
//    }
}