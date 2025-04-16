package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.io.IOException;

public class StudentGoal5Controller
{
    @javafx.fxml.FXML
    private TextField enterAmount;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextArea receiptTextArea;
    @javafx.fxml.FXML
    private Label balanceLabel;
    @javafx.fxml.FXML
    private ComboBox<String> currencyComBox;
    private double userBalance = 1000.0; // starting balance in USD
    private double lastTransactionAmount = 0.0;
    private String lastCurrency = "";

    private final ObservableList<String> currencyList = FXCollections.observableArrayList("EUR", "JPY", "INR");

    @javafx.fxml.FXML
    public void initialize() {
        currencyComBox.setItems(currencyList);
        balanceLabel.setText("Current Balance: $" + userBalance);
    }

    @javafx.fxml.FXML
    public void exchangeNow(ActionEvent actionEvent) {
        String selectedCurrency = currencyComBox.getValue();
        String input = enterAmount.getText();

        if (selectedCurrency == null || input.isEmpty()) {
            confirmationLabel.setText("Select a currency and enter an amount.");
            return;
        }

        try {
            double amount = Double.parseDouble(input);

            if (amount > userBalance) {
                confirmationLabel.setText("Insufficient balance.");
                return;
            }

            float rate = Float.parseFloat(selectedCurrency);
            double exchangedAmount = amount * rate;

            confirmationLabel.setText(String.format("Exchanged $%.2f to %.2f %s", amount, exchangedAmount, selectedCurrency));
            lastTransactionAmount = exchangedAmount;
            lastCurrency = selectedCurrency;

        } catch (NumberFormatException e) {
            confirmationLabel.setText("Enter a valid amount.");
        }
    }

    @javafx.fxml.FXML
    public void confirmTransaction(ActionEvent actionEvent) {
        String input = enterAmount.getText();
        String selectedCurrency = currencyComBox.getValue();

        if (input.isEmpty() || selectedCurrency == null || lastTransactionAmount == 0.0) {
            confirmationLabel.setText("No transaction to confirm.");
            return;
        }

        double amount = Double.parseDouble(input);
        userBalance -= amount;
        balanceLabel.setText("Current Balance: $" + String.format("%.2f", userBalance));

        String receipt = generateReceipt(amount, lastTransactionAmount, selectedCurrency);
        receiptTextArea.setText(receipt);
        confirmationLabel.setText("Transaction confirmed!");
    }
    private String generateReceipt(double amount, double convertedAmount, String currency) {
        return "----------- Receipt -----------\n"
                + "Amount Entered: " + amount + " USD\n"
                + "Converted Amount: " + convertedAmount + " " + currency + "\n"
                + "Currency Type: " + currency + "\n"
                + "Status: Successful\n"
                + "-------------------------------";
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentDashboard");
    }

    @javafx.fxml.FXML
    public void downloadReceipt(ActionEvent actionEvent) {
        if (receiptTextArea.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Missing Information");
            alert.setHeaderText(null);
            alert.setContentText("Download Failed.Could not save the receipt.");
            alert.showAndWait();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Downloaded");
        alert.setHeaderText(null);
        alert.setContentText("Download Complete");
        alert.showAndWait();
        return;

    }
}