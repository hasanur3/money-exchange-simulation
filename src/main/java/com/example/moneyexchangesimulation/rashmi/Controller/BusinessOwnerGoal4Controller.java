package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BusinessOwnerGoal4Controller
{
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private Label confirmationLabel;
    @javafx.fxml.FXML
    private TextField bankAccountNumberTextField;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        validationLabel.setText(" ");
        confirmationLabel.setText("");
        statusLabel.setText("");
    }

    @javafx.fxml.FXML
    public void bulkTransaction(ActionEvent actionEvent) {
        String account = bankAccountNumberTextField.getText().trim();
        if (account.isEmpty() || !account.matches("\\d{10,18}")) {
            validationLabel.setText("Invalid account number.");
            return;
        }

        validationLabel.setText("Account validated.");


        statusLabel.setText("Bulk transactions processed successfully.");
        confirmationLabel.setText("Receipts downloaded successfully.");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/BusinessOwnerDashboard");
    }
}