package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class BusinessOwnerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }



    @javafx.fxml.FXML
    public void logoutButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal1");
    }

    @javafx.fxml.FXML
    public void genBusinessFinReports(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("BusinessOwnerGoal5");
    }

    @javafx.fxml.FXML
    public void manageBusinessExpenses(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal6");
    }

    @javafx.fxml.FXML
    public void monitorBusinessExchange(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal1");
    }

    @javafx.fxml.FXML
    public void accessBusinessLoanOffer(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal2");
    }

    @javafx.fxml.FXML
    public void manageSupplierPayments(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal8");
    }

    @javafx.fxml.FXML
    public void handleEmployeePayroll(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal7");
    }

    @javafx.fxml.FXML
    public void integrateBusinessBankAcc(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal3");
    }

    @javafx.fxml.FXML
    public void automateBulkTrans(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("BusinessOwnerGoal4");
    }

}