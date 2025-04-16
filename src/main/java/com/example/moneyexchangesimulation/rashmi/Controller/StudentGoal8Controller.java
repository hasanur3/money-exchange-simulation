package com.example.moneyexchangesimulation.rashmi.Controller;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.io.IOException;

public class StudentGoal8Controller
{
    @javafx.fxml.FXML
    private Label disRateLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void applyDis(ActionEvent actionEvent) {
        disRateLabel.setText("Student Discount: 10% Applied");
        showAlert(Alert.AlertType.INFORMATION, "Discount Applied", "Your 10% student discount has been applied successfully.");
    }



    @javafx.fxml.FXML
    public void stuDis(ActionEvent actionEvent) {
        disRateLabel.setText("Available Discount: 10% for verified students");
        showAlert(Alert.AlertType.INFORMATION, "Discount Info", "Eligible students receive a 10% discount on all transactions.");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {

    }

    @javafx.fxml.FXML
    public void verifyStuStatus(ActionEvent actionEvent) {
        disRateLabel.setText("Student Status: Verified");
        showAlert(Alert.AlertType.INFORMATION, "Status Verified", "Your student status has been successfully verified.");
    }
}