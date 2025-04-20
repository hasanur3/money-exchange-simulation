package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import com.example.moneyexchangesimulation.rashmi.ModelClass.PayRoll;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class BusinessOwnerGoal7Controller
{
    @javafx.fxml.FXML
    private TextField salaryTextField;
    @javafx.fxml.FXML
    private TextField employeeNameTextField;
    @javafx.fxml.FXML
    private TextField employeeIDTextField;
    @javafx.fxml.FXML
    private Label validateLabel;
    @javafx.fxml.FXML
    private Label payrollStatusLabel;
    @javafx.fxml.FXML
    private Label downloadLabel;
    @javafx.fxml.FXML
    private DatePicker DOJ;
    private final ArrayList<PayRoll> payrollList = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        payrollStatusLabel.setText("");
        validateLabel.setText("");
        downloadLabel.setText("");
    }

    @javafx.fxml.FXML
    public void download(ActionEvent actionEvent) {
        if (payrollList.isEmpty()) {
            downloadLabel.setText("No payroll data to download.");
            return;
        }

        StringBuilder report = new StringBuilder("Payroll Report:\n");
        for (PayRoll p : payrollList) {
            report.append("ID: ").append(p.getEmployeeID())
                    .append(", Name: ").append(p.getEmployeeName())
                    .append(", DOJ: ").append(p.getDOJ())
                    .append(", Salary: $").append(p.getSalary())
                    .append("\n");
        }
        downloadLabel.setText(report.toString());
    }

    @javafx.fxml.FXML
    public void payrollManagement(ActionEvent actionEvent) {
        String idText = employeeIDTextField.getText();
        String name = employeeNameTextField.getText();
        String salaryText = salaryTextField.getText();
        LocalDate doj = DOJ.getValue();  // Date of joining


        if (idText.isEmpty() || name.isEmpty() || salaryText.isEmpty() || doj == null) {
            validateLabel.setText("Please fill in all fields.");
            return;
        }


        if (!idText.matches("\\d+")) {
            validateLabel.setText("ID must be a valid number.");
            return;
        }
        if (!salaryText.matches("\\d+(\\.\\d{1,2})?")) {
            validateLabel.setText("Salary must be a valid number (e.g., 1000 or 1000.50).");
            return;
        }


        int id = Integer.parseInt(idText);
        double salary = Double.parseDouble(salaryText);
        PayRoll payroll = new PayRoll(id, name, doj, salary);
        payrollList.add(payroll);
        validateLabel.setText("Payroll added successfully.");
        clearFields();
    }


    private void clearFields() {
        employeeIDTextField.clear();
        employeeNameTextField.clear();
        salaryTextField.clear();
        DOJ.setValue(null);
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