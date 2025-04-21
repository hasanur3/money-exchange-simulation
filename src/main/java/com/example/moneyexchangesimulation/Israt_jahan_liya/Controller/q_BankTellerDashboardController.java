package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class q_BankTellerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goToManageCashReserves(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Israt_jahan_liya/c_ManageCashReserves.fxml");
    }

    @javafx.fxml.FXML
    public void goToGenerateReports(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/g_GenerateReports.fxml");
    }


    @javafx.fxml.FXML
    public void goToExchangeRateInquiry(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/f_ExchangeRateInquiry.fxml");
    }

    @FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void goToCurrencyExchange(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/a_CustomerCurrencyExchange.fxml");
    }

    @javafx.fxml.FXML
    public void goToLargeTransactions(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Israt_jahan_liya/d_HandleLargeTransactions.fxml");
    }

    @javafx.fxml.FXML
    public void goToVerifyIdentity(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Israt_jahan_liya/b_VerifyCustomerIdentity.fxml");
    }

    @javafx.fxml.FXML
    public void goToProcessRefunds(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/e_ProcessRefunds.fxml");
    }


    @javafx.fxml.FXML
    public void goToReportSuspiciousActivity(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/h_ReportSuspiciousActivity.fxml");
    }
}