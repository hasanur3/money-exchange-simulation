package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class r_ComplianceOfficerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void goToTellerTraining(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/m_TellerTraining");
    }

    @javafx.fxml.FXML
    public void goToInvestigateNonCompliance(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/p_InvestigateNonCompliance");
    }

    @javafx.fxml.FXML
    public void goToAuditTransactions(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/l_AuditTransactions");
    }

    @javafx.fxml.FXML
    public void logOutButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/moneyexchangesimulation/Login.fxml"));
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @javafx.fxml.FXML
    public void goToHighRiskTransaction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/n_HighRiskTransaction");
    }

    @javafx.fxml.FXML
    public void goToReviewHighValue(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/j_ReviewHighValueTransactions");
    }

    @javafx.fxml.FXML
    public void goToMonitorFraud(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/i_MonitorFraud");
    }

    @javafx.fxml.FXML
    public void goToReviewAlerts(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/o_ReviewAlerts");
    }

    @javafx.fxml.FXML
    public void goToFlagSuspicious(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/k_FlagSuspiciousActivities");
    }
}