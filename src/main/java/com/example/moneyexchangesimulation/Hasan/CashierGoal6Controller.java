package com.example.moneyexchangesimulation.Hasan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    public void initialize() {
        currencyCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCurrency()));
        rateCol.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getRate()));

        ObservableList<ExchangeRate> data = FXCollections.observableArrayList(
                new ExchangeRate("USD", "110.00"),
                new ExchangeRate("EUR", "118.00"),
                new ExchangeRate("GBP", "128.00")
        );

        rateTable.setItems(data);
    }

    public static class ExchangeRate {
        private final String currency;
        private final String rate;

        public ExchangeRate(String currency, String rate) {
            this.currency = currency;
            this.rate = rate;
        }

        public String getCurrency() {
            return currency;
        }
        public String getRate() {
            return rate;
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
