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
                "Bank Teller ",
                "Compliance Officer",
                "Admin",
                "Audit");

    }

    @javafx.fxml.FXML
    public void loginButton(ActionEvent actionEvent) throws IOException {
// Get input values
        String username = userNameTextField.getText().trim();
        String password = passwordField.getText();
        String selectedRole = userComboBox.getSelectionModel().getSelectedItem();

        // Check for empty fields
        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Username or Password cannot be empty");
            return;
        }
        if (selectedRole == null) {
            messageLabel.setText("Please select a role");
            return;
        }

        // Authenticate user
        List<User> userList = UserManager.getUsers();
        for (User user : userList) {
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                // Set the logged-in user
                UserManager.setLoggedInUser(user);
                messageLabel.setText("Login successful");
                // Open the respective dashboard
//                openDashboard(userComboBox.getselected);
//                return;
            }
        }

        // If authentication fails
        messageLabel.setText("Invalid username or password");
    }

    private void openDashboard(String role, ActionEvent event) throws IOException {
        String fxmlFile = null;

        // Determine the correct dashboard file
        if (role.equals("System Manager")) {
            fxmlFile = "/oop/firebrigadeoperationsapp/Mahreen2311459/Dispatcher/newDash.fxml";
        } else if (role.equals("Student")) {
            fxmlFile = "/oop/firebrigadeoperationsapp/Mahreen2311459/Firefighter/FirefighterDashboard.fxml";
        } else if (role.equals("Business Owner") || role.equals("Training officer")) {
            fxmlFile = "dashboard.fxml";
        } else if (role.equals("Bank Teller")) {
            fxmlFile = "/oop/firebrigadeoperationsapp/Technician/TechnicianDashBoard.fxml";
        } else if (role.equals("Compliance Officer")) {
            fxmlFile = "/oop/firebrigadeoperationsapp/BattalionChief/BattalionChiefDashbard.fxml";
        } else if (role.equals("Admin")) {
            fxmlFile = "/oop/firebrigadeoperationsapp/Forensic_expert/dashboard_forensic_expert.fxml";
        } else if (role.equals("Audit")) {
            fxmlFile = "/oop/firebrigadeoperationsapp/Search_operator/dashboard_search_operator.fxml";
            System.out.println(getClass().getResource(fxmlFile));
        }
        if (fxmlFile != null) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlFile));
                Parent root = fxmlLoader.load();
                Scene scene = new Scene(root);

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
                messageLabel.setText("Error loading the dashboard.");
            }
        } else {
            messageLabel.setText("Dashboard for this role is not implemented yet.");
        }
    }


    @javafx.fxml.FXML
    public void signUpButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("SignUp.fxml"));
            Parent root = fxmlLoader.load();
            Scene scene = new Scene(root);

            // ✅ Correct casting of the event source
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            messageLabel.setText("Error loading the sign-up page.");
        }
    }
}



