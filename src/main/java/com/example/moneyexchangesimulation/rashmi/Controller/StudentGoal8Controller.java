package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.io.IOException;

public class StudentGoal8Controller
{
    @javafx.fxml.FXML
    private Label disRateLabel;
    private boolean isVerified = false; // if the student is verified
    private final String discountValue = "10%";

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
    private void applyDiscount() {
        disRateLabel.setText("Discount Applied: " + discountValue);
        showAlert(Alert.AlertType.INFORMATION, "Discount Applied", "A 10% student discount has been applied automatically.");
    }


    @javafx.fxml.FXML
    public void applyDis(ActionEvent actionEvent) {
        if (isVerified) {
            applyDiscount(); // Re-apply if needed
        } else {
            showAlert(Alert.AlertType.WARNING, "Verification Needed", "Please verify your student status first.");
        }
    }



    @javafx.fxml.FXML
    public void stuDis(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Student Discount", "Welcome to the Student Discounts section.");

    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException  {
        SceneSwitcher.switchTo("Login");


    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentDashboard");

    }

    @javafx.fxml.FXML
    public void verifyStuStatus(ActionEvent actionEvent) {
        isVerified = true;

        if (isVerified) {
            showAlert(Alert.AlertType.INFORMATION, "Verification Successful", "Student status verified.");
            applyDiscount(); // Automatically apply 10% discount
        } else {
            showAlert(Alert.AlertType.ERROR, "Verification Failed", "You are not eligible for student discounts.");
        }

    }
}