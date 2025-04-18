package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.BusinessLoan;
import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import com.example.moneyexchangesimulation.rashmi.ModelClass.Transaction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.UUID;

public class BusinessOwnerGoal2Controller
{
    @javafx.fxml.FXML
    private TableView<BusinessLoan> loanTableView;
    @javafx.fxml.FXML
    private Label loanAppliedOrNot;
    @javafx.fxml.FXML
    private TableColumn<Transaction,Integer> transactionIDTableColumn;
    @javafx.fxml.FXML
    private TextField totalTransAmountTextField;
    @javafx.fxml.FXML
    private TableColumn<BusinessLoan,Float> availableLoanTableColumn;
    @javafx.fxml.FXML
    private TextField transAmountForApplyLoanTextField;
    @javafx.fxml.FXML
    private Label eligibleForLoanOrNot;
    @javafx.fxml.FXML
    private ComboBox<String> currencyTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Transaction,Double> transactionAmountTableColumn;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextFiled;
    private final ObservableList<BusinessLoan> loans = FXCollections.observableArrayList();

    private final double eligibilityThreshold = 5000.0;

    @javafx.fxml.FXML
    public void initialize() {
        currencyTypeComboBox.setItems(FXCollections.observableArrayList("USD", "EUR", "INR"));
        transactionIDTableColumn.setCellValueFactory(new PropertyValueFactory<>("transactionID"));
        transactionAmountTableColumn.setCellValueFactory(new PropertyValueFactory<>("transactionAmount"));
        availableLoanTableColumn.setCellValueFactory(new PropertyValueFactory<>("loanOffer"));
        loanTableView.setItems(loans);
    }
    private void showAlert(Alert.AlertType type, String title, String content) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }

    @javafx.fxml.FXML
    public void applyForALoan(ActionEvent actionEvent) {
        String name = nameTextFiled.getText();
        String email = emailTextField.getText();
        String amountStr = transAmountForApplyLoanTextField.getText();
        String currency = currencyTypeComboBox.getValue();

        if (name.isEmpty() || email.isEmpty() || amountStr.isEmpty() || currency == null) {
            showAlert(Alert.AlertType.ERROR, "Missing Information", "Please fill all loan application fields.");
            return;
        }

        double amount;
        try {
            amount = Double.parseDouble(amountStr);
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Invalid Amount", "Please enter a valid transaction amount.");
            return;
        }

        if (amount >= eligibilityThreshold) {
            eligibleForLoanOrNot.setText("Eligible for Loan");
            loanAppliedOrNot.setText("Loan Applied Successfully");

            String transactionId = UUID.randomUUID().toString().substring(0, 8);
            BusinessLoan loan = new BusinessLoan((int)(Math.random() * 100000), nameTextFiled.getText(), currencyTypeComboBox.getValue(), (float)(amount * 1.5));
            loans.add(loan);
        } else {
            eligibleForLoanOrNot.setText("Not Eligible for Loan");
            loanAppliedOrNot.setText("Loan Application Denied");
        }

    }

    @javafx.fxml.FXML
    public void businessLoan(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Business Loan Section", "Welcome to the Business Loan Offers section.");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerDashboard");
    }
}