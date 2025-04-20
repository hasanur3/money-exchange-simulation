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
import java.util.ArrayList;

public class BusinessOwnerGoal6Controller
{
    @javafx.fxml.FXML
    private Label downloadOrFailLabel;
    @javafx.fxml.FXML
    private TextField expenseTextField;
    @javafx.fxml.FXML
    private Label totalExpenseLabel;
    private final ArrayList<Double> expenseList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {
        totalExpenseLabel.setText("Total Expenses: $0.00");
    }
    private void updateTotal() {
        double total = 0;
        for (double expense : expenseList) {
            total += expense;
        }
        totalExpenseLabel.setText("Total Expenses: $" + String.format("%.2f", total));
    }

    @javafx.fxml.FXML
    public void generateReport(ActionEvent actionEvent) {
        String text = expenseTextField.getText();

        try {
            double amount = Double.parseDouble(text);
            expenseList.add(amount); // save expense
            expenseTextField.clear();
            downloadOrFailLabel.setText("Expense added.");
            updateTotal();
        } catch (NumberFormatException e) {
            downloadOrFailLabel.setText("Enter a valid number.");
        }
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void businessExpense(ActionEvent actionEvent) {
        if (expenseList.isEmpty()) {
            downloadOrFailLabel.setText("No expenses yet.");
        } else {
            String report = "Expenses:\n";
            int count = 1;
            for (Double expense : expenseList) {
                report += count + ". $" + expense + "\n";
                count++;
            }
            downloadOrFailLabel.setText(report);
        }

    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/BusinessOwnerDashboard");
    }
}