package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentGoal7Controller {
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextFiled;
    @javafx.fxml.FXML
    private TextField accNumTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }
    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }



    @javafx.fxml.FXML
    public void transferMoney(ActionEvent actionEvent) {
        String name = nameTextFiled.getText();
        String accNum = accNumTextField.getText();
        String email = emailTextField.getText();

        if (name.isEmpty() || accNum.isEmpty() || email.isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please fill in all fields.");
        } else {
            showAlert(Alert.AlertType.INFORMATION, "Input Captured",
                    "Name: " + name + "\nAccount: " + accNum + "\nEmail: " + email);
        }

    }

    @javafx.fxml.FXML
    public void sendSMS(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "SMS Notification", "SMS has been sent about the transaction.");


    }

    @javafx.fxml.FXML
    public void validateTrans(ActionEvent actionEvent) {
        String accNum = accNumTextField.getText();
        if (accNum.matches("\\d{10}")) {
            showAlert(Alert.AlertType.INFORMATION, "Validation", "Account number is valid and balance is sufficient.");
        } else {
            showAlert(Alert.AlertType.ERROR, "Validation Error", "Invalid account number format.");
        }

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
    public void confirmTrans(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Transaction", "Transaction processed successfully.");

        }
    }


