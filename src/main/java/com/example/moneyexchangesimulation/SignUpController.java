package com.example.moneyexchangesimulation;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignUpController
{
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private Label messageLabel;

    @javafx.fxml.FXML
    public void initialize() {
        // Adding roles to the combo box
        userTypeComboBox.getItems().addAll(
                "Cashier",
                "System Manager",
                "Student",
                "Business Owner",
                "Bank Teller ",
                "Compliance Officer",
                "Admin",
                "Audit");
    }

    @javafx.fxml.FXML
    public void signUpButton(ActionEvent actionEvent) {

    }
}