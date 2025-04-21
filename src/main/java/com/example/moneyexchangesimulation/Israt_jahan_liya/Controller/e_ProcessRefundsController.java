package com.example.moneyexchangesimulation.Israt_jahan_liya.Controller;

import com.example.moneyexchangesimulation.Hasan.SceneSwitcher;
import com.example.moneyexchangesimulation.Israt_jahan_liya.ModelClass.RefundInfo;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class e_ProcessRefundsController
{
    @javafx.fxml.FXML
    private Label refundAmountLabel;
    @javafx.fxml.FXML
    private Label refundStatusLabel;
    @javafx.fxml.FXML
    private TextField referenceIdField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void processRefundButton(ActionEvent actionEvent) {
        String refId = referenceIdField.getText();

        if (refId == null || refId.isEmpty()) {
            refundStatusLabel.setText("Enter a valid reference ID.");
            return;
        }


        if (refId.startsWith("TXN")) {
            double refundAmount = 500.0;
            RefundInfo info = new RefundInfo(refId, refundAmount);

            refundAmountLabel.setText("$" + info.getRefundAmount());
            refundStatusLabel.setText("Refund approved and processed.");
        } else {
            refundStatusLabel.setText("Transaction not eligible for refund.");
        }
    }

    @javafx.fxml.FXML
    public void GoToDashBoardButton(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Israt_jahan_liya/q_BankTellerDashboard");
    }
}