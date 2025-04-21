package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.TellerTraining;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class m_TellerTrainingController
{
    @javafx.fxml.FXML
    private TextField moduleNameField;
    @javafx.fxml.FXML
    private Label guidanceNoteLabel;
    @javafx.fxml.FXML
    private TextField tellerNameField;
    @javafx.fxml.FXML
    private Label certificationStatusLabel;

    private TellerTraining training;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void submitTrainingButton(ActionEvent actionEvent) {
        String teller = tellerNameField.getText();
        String module = moduleNameField.getText();

        if (teller.isEmpty() || module.isEmpty()) {
            certificationStatusLabel.setText("Please fill in all fields.");
            return;
        }

        boolean certified = module.toLowerCase().contains("aml") || module.toLowerCase().contains("fraud");
        String note = certified ? "Certification Granted. Continue Monitoring." : "More Training Required.";

        training = new TellerTraining(teller, module, certified, note);
        certificationStatusLabel.setText(certified ? "Certified" : "Not Certified");
        guidanceNoteLabel.setText(note);
    }

    public TellerTraining getTraining() {
        return training;
    }

    public void setTraining(TellerTraining training) {
        this.training = training;
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}