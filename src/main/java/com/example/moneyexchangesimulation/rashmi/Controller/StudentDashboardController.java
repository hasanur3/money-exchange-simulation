package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.*;
import java.io.IOException;

public class StudentDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }


    @javafx.fxml.FXML
    public void availDiscount(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentGoal8");

    }

    @javafx.fxml.FXML
    public void transferMoney(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentGoal7");

    }

    @javafx.fxml.FXML
    public void earnRewards(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentGoal4");
    }

    @javafx.fxml.FXML
    public void currencyExchangeRates(ActionEvent actionEvent) throws IOException{

        SceneSwitcher.switchTo("rashmi/StudentGoal1");
    }

    @javafx.fxml.FXML
    public void paymentMethod(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentGoal6");
    }

    @javafx.fxml.FXML
    public void eduFinancialTips(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentGoal3");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void transaction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("rashmi/StudentGoal5");
    }

    @javafx.fxml.FXML
    public void convertCurrency(ActionEvent actionEvent) throws IOException {

        SceneSwitcher.switchTo("rashmi/StudentGoal2");
    }


}