package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import com.example.moneyexchangesimulation.rashmi.ModelClass.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.time.LocalDate;

public class BusinessOwnerGoal1Controller
{
    @javafx.fxml.FXML
    private TableColumn<Transaction, Float> amountTableColumn;
    @javafx.fxml.FXML
    private TableView<Transaction> transactionTableView;
    @javafx.fxml.FXML
    private TableColumn<Transaction,String> currencyTypeTableColumn;
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private DatePicker datePicker;
    @javafx.fxml.FXML
    private TableColumn<Transaction, LocalDate> dateTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> currencyTypeComboBox;

    @javafx.fxml.FXML
    private TableColumn<Transaction,Integer> transactionIDTableView;
    private final ObservableList<Transaction> transactions = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        currencyTypeComboBox.getItems().addAll("USD","EUR","INR");
        transactions.addAll(
                new Transaction(199657, LocalDate.of(2025, 4, 1), "USD", 1000.0),
                new Transaction(567890, LocalDate.of(2025, 4, 2), "EUR", 3500.0),
                new Transaction(123489, LocalDate.of(2025, 4, 2), "INR", 10000.0)
        );

        transactionTableView.setItems(transactions);


        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        currencyTypeTableColumn.setCellValueFactory(new PropertyValueFactory<>("currency"));
        amountTableColumn.setCellValueFactory(new PropertyValueFactory<>("amount"));


        currencyTypeComboBox.setItems(FXCollections.observableArrayList("USD", "EUR", "INR", "GBP"));
    }
    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void download(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Download", "Transaction report downloaded successfully.");
    }

    @javafx.fxml.FXML
    public void businessTransaction(ActionEvent actionEvent) {
        transactionTableView.setItems(transactions);
        showAlert(Alert.AlertType.INFORMATION, "Business Transactions", "All transactions displayed.");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerDashboard");
    }
}