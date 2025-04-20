package com.example.moneyexchangesimulation;

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
import java.util.List;

public class LoginController {
    @javafx.fxml.FXML
    private PasswordField passwordField;
    @javafx.fxml.FXML
    private Label messageLabel;
    @javafx.fxml.FXML
    private ComboBox<String> userComboBox;
    @javafx.fxml.FXML
    private TextField userNameTextField;

    @javafx.fxml.FXML
    public void initialize() {
        // Adding roles to the combo box
        userComboBox.getItems().addAll(
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
    public void loginButton(ActionEvent actionEvent) {
        String username = userNameTextField.getText().trim();
        String password = passwordField.getText();
        String selectedRole = userComboBox.getSelectionModel().getSelectedItem();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Username or Password cannot be empty");
            return;
        }

        if (selectedRole == null) {
            messageLabel.setText("Please select a role");
            return;
        }

        User user = UserManager.checkLogIn(username, password);

        if (user != null) {
            if (user.getRole().equals(selectedRole)) {
                UserManager.setLoggedInUser(user);
                messageLabel.setText("Login successful");
                try {
                    openDashboard(user.getRole(), actionEvent);
                } catch (IOException e) {
                    messageLabel.setText("Failed to open dashboard.");
                    e.printStackTrace();
                }
            } else {
                messageLabel.setText("Role mismatch for this user.");
            }
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }

    private void openDashboard(String role, ActionEvent event) throws IOException {
        String fxmlFile = null;

        if (role.equals("Cashier")) {
            fxmlFile = "/com/example/moneyexchangesimulation/Hasan/cashier_dashboard.fxml";
        } else if (role.equals("System Manager")) {
            fxmlFile = "/com/example/moneyexchangesimulation/Hasan/systemManagerDashboard.fxml";
        } else if (role.equals("Student")) {
            fxmlFile = "/com/example/moneyexchangesimulation/rashmi/StudentDashboard.fxml";
        } else if (role.equals("Business Owner")) {
            fxmlFile = "/com/example/moneyexchangesimulation/rashmi/BusinessOwnerDashboard.fxml";
        } else if (role.equals("Bank Teller")) {
            fxmlFile = "/com/example/moneyexchangesimulation/Israt_jahan_liya/a_CustomerCurrencyExchange.fxml";
        } else if (role.equals("Compliance Officer")) {
            fxmlFile = "/com/example/moneyexchangesimulation/Israt_jahan_liya/i_MonitorFraud.fxml;";
        } else if (role.equals("Admin")) {
            fxmlFile = "  ";
        } else if (role.equals("Audit")) {
            fxmlFile = "  ";
        }

        if (fxmlFile != null) {
            FXMLLoader loader = new FXMLLoader(LoginController.class.getResource(fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            messageLabel.setText("Dashboard for this role is not yet implemented.");
        }
    }

    @javafx.fxml.FXML
    public void signUpButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            messageLabel.setText("Error loading the sign-up page.");
            e.printStackTrace();
        }
    }
}



