package com.example.moneyexchangesimulation;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
                "Bank Teller",
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

    @javafx.fxml.FXML
    public void logIn(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}