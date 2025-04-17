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
        String name = nameTextField.getText().trim();
        String email = emailTextField.getText().trim(); // optional
        String password = passwordField.getText();
        String role = userTypeComboBox.getSelectionModel().getSelectedItem();

        if (name.isEmpty() || password.isEmpty() || role == null) {
            messageLabel.setText("Please fill all fields");
            return;
        }

        // Create and save user
        User newUser = new User(name, password, role);
        UserManager.addUser(newUser);

        messageLabel.setText("Signup successful! Go to login.");

        // Optional: clear fields
        nameTextField.clear();
        passwordField.clear();
        emailTextField.clear();
        userTypeComboBox.getSelectionModel().clearSelection();
    }
}