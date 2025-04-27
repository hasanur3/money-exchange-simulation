
package com.example.moneyexchangesimulation.Hasan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.IOException;

public class CashierGoal6Controller {

    @javafx.fxml.FXML
    private TableColumn<ExchangeRate, String> currencyCol;
    @javafx.fxml.FXML
    private TableView<ExchangeRate> rateTable;
    @javafx.fxml.FXML
    private TableColumn<ExchangeRate, String> rateCol;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextField currencyField;
    @javafx.fxml.FXML
    private Label confirmationLabel11;
    @javafx.fxml.FXML
    private TextField buyingRateField;
    @javafx.fxml.FXML
    private Label confirmationLabel1;
    @javafx.fxml.FXML
    private TableColumn<ExchangeRate, String> buyingRateCol;
    @javafx.fxml.FXML
    private TableColumn<ExchangeRate, String> sellingRateCol;

    private ObservableList<ExchangeRate> data; // new added

    @javafx.fxml.FXML
    public void initialize() {
        currencyCol.setCellValueFactory(new PropertyValueFactory<>("currency"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("rate"));
        buyingRateCol.setCellValueFactory(new PropertyValueFactory<>("buyingRate"));// new added
        sellingRateCol.setCellValueFactory(new PropertyValueFactory<>("sellingRate"));// new added

        data = FXCollections.observableArrayList(
                new ExchangeRate("USD", "110.00", "110.00", "115.50"), // new added
                new ExchangeRate("EUR", "118.00", "118.00", "123.90"),
                new ExchangeRate("GBP", "128.00", "128.00", "134.40")
        );

        rateTable.setItems(data);
    }

    @javafx.fxml.FXML
    public void AddButton(ActionEvent actionEvent) {  // newly added button
        String currency = currencyField.getText();
        String buyingRateStr = buyingRateField.getText();

        if (!currency.isEmpty() && !buyingRateStr.isEmpty()) {
            try {
                double buyingRate = Double.parseDouble(buyingRateStr);
                double sellingRate = buyingRate * 1.05;

                data.add(new ExchangeRate(
                        currency,
                        buyingRateStr,
                        buyingRateStr,
                        String.valueOf(sellingRate)
                ));

                currencyField.clear();
                buyingRateField.clear();

            } catch (NumberFormatException e) {
                confirmationLabel.setText("Invalid buying rate.");
            }
        } else {
            confirmationLabel.setText("Fill both fields.");
        }
    }

    public static class ExchangeRate {
        private final SimpleStringProperty currency;
        private final SimpleStringProperty rate;
        private final SimpleStringProperty buyingRate;
        private final SimpleStringProperty sellingRate;

        public ExchangeRate(String currency, String rate, String buyingRate, String sellingRate) { // UPDATED
            this.currency = new SimpleStringProperty(currency);
            this.rate = new SimpleStringProperty(rate);
            this.buyingRate = new SimpleStringProperty(buyingRate);
            this.sellingRate = new SimpleStringProperty(sellingRate);
        }

        public String getCurrency() {
            return currency.get();
        }

        public String getRate() {
            return rate.get();
        }

        public String getBuyingRate() {
            return buyingRate.get();
        }

        public String getSellingRate() {
            return sellingRate.get();
        }
    }

    @javafx.fxml.FXML
    public void printRates(ActionEvent actionEvent) {
        confirmationLabel.setText("Exchange rates printed.");
    }

    @javafx.fxml.FXML
    public void sendViaEmail(ActionEvent actionEvent) {
        confirmationLabel.setText("Exchange rates sent via email.");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_dashboard");
    }
}

