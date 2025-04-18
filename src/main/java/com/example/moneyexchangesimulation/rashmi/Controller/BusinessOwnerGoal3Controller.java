package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class BusinessOwnerGoal3Controller
{
    @javafx.fxml.FXML
    private TextField bankAccountNumberTextField;
    @javafx.fxml.FXML
    private Label validateOrNot;
    @javafx.fxml.FXML
    private Label updateOrRemoved;
    private String storedAccount = null;


    @javafx.fxml.FXML
    public void initialize() {
        validateOrNot.setText("");
        updateOrRemoved.setText("");

    }

    @javafx.fxml.FXML
    public void addBankAccount(ActionEvent actionEvent) {
        String account = bankAccountNumberTextField.getText().trim();

        if (account.isEmpty()) {
            validateOrNot.setText("Enter account number.");
        } else if (!account.matches("\\d{10,18}")) {
            validateOrNot.setText("Invalid account number.");
        } else if (storedAccount != null && storedAccount.equals(account)) {
            validateOrNot.setText("Account already exists.");
        } else {
            storedAccount = account;
            validateOrNot.setText("Account added.");
        }
    }

    @javafx.fxml.FXML
    public void update(ActionEvent actionEvent) {
        String account = bankAccountNumberTextField.getText().trim();

        if (storedAccount != null && storedAccount.equals(account)) {
            updateOrRemoved.setText("Account updated.");
        } else {
            updateOrRemoved.setText("Account not found.");
        }
    }

    @javafx.fxml.FXML
    public void remove(ActionEvent actionEvent) {
        String account = bankAccountNumberTextField.getText().trim();

        if (storedAccount != null && storedAccount.equals(account)) {
            storedAccount = null;
            updateOrRemoved.setText("Account removed.");
        } else {
            updateOrRemoved.setText("Account not found.");
        }
    }

    @javafx.fxml.FXML
    public void validate(ActionEvent actionEvent) {
        String account = bankAccountNumberTextField.getText().trim();

        if (account.isEmpty()) {
            validateOrNot.setText("Enter account number.");
        } else if (account.matches("\\d{10,18}")) {
            validateOrNot.setText("Valid account.");
        } else {
            validateOrNot.setText("Invalid account.");
        }
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