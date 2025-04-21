package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.CustomerVerification;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class b_VerifyCustomerIdentityController
{
    @javafx.fxml.FXML
    private TextField idField;
    @javafx.fxml.FXML
    private Label ValidationResultLabal;
    @javafx.fxml.FXML
    private TextField txnIdField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private Label CustomerName;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void validateIdentityButton(ActionEvent actionEvent) {
        String name = nameField.getText();
        String id = idField.getText();
        String txnId = txnIdField.getText();

        if (!name.isEmpty() && !id.isEmpty() && !txnId.isEmpty()) {
            CustomerVerification identity = new CustomerVerification(name, Integer.parseInt(id), Integer.parseInt(txnId));
            ValidationResultLabal.setText("Validation passed for: " + identity.getName());
        } else {
            ValidationResultLabal.setText("Please fill all fields.");
        }
    }

    @javafx.fxml.FXML
    public void checkLegitimacyButton(ActionEvent actionEvent) {
        String id = idField.getText();
        if (id != null && id.length() >= 5) {
            ValidationResultLabal.setText("ID appears legitimate.");
        } else {
            ValidationResultLabal.setText("Invalid or suspicious ID.");
        }
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) {
    }
}