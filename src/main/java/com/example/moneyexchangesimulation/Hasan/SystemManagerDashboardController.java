package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SystemManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void userManagement(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal2");
    }


    @javafx.fxml.FXML
    public void performanceMetrics(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal7");
    }

    @javafx.fxml.FXML
    public void securitySettings(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal6");
    }

    @javafx.fxml.FXML
    public void viewLogs(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal4");
    }

    @javafx.fxml.FXML
    public void systemStatus(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal1");
    }

    @javafx.fxml.FXML
    public void systemUpdates(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal5");
    }

    @javafx.fxml.FXML
    public void backUpData(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal3");
    }

    @javafx.fxml.FXML
    public void restoreBackup(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerGoal8");
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}