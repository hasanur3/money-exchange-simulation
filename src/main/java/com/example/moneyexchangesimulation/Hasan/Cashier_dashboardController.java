package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Cashier_dashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void verifyId(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_Goal-2");
    }


    @javafx.fxml.FXML
    public void cashBalance(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_Goal-4");
    }

    @javafx.fxml.FXML
    public void txnApproval(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_Goal-7");
    }

    @javafx.fxml.FXML
    public void exchangeRates(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/cashier_Goal-6");
    }

    @javafx.fxml.FXML
    public void receipt(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Hasan/cashier_Goal-5");
    }

    @javafx.fxml.FXML
    public void logs(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Hasan/cashier_Goal-8");
    }

    @javafx.fxml.FXML
    public void processExchange(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Hasan/cashier_Goal1");
    }

   @javafx.fxml.FXML
       public void refunds(ActionEvent actionEvent) throws IOException{
       SceneSwitcher.switchTo("Hasan/cashier_Goal-3");
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}