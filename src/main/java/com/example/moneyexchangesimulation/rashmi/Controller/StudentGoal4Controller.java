package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class StudentGoal4Controller
{
    @javafx.fxml.FXML
    private TextField referCodeTextField;
    @javafx.fxml.FXML
    private Label bonusLabel;
    @javafx.fxml.FXML
    private Label showCode;
    @javafx.fxml.FXML
    private Label messageLabel;
    private final String personalReferralCode = generateReferralCode();
    private boolean rewardClaimed = false;

    @javafx.fxml.FXML
    public void initialize() {
        showCode.setText("Your Code: " + personalReferralCode);
        bonusLabel.setText("Total Bonus: ₹0");
    }
    private String generateReferralCode() {
        // Generate a simple random 6-character alphanumeric referral code
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            int index = (int) (Math.random() * characters.length());
            code.append(characters.charAt(index));
        }
        return code.toString();
    }


    @javafx.fxml.FXML
    public void earnRewards(ActionEvent actionEvent) {
        if (!rewardClaimed) {
            bonusLabel.setText("Total Bonus: ₹100");
            messageLabel.setText("You've earned ₹100 for joining!");
            rewardClaimed = true;
        } else {
            messageLabel.setText("Reward already claimed.");
        }
    }

    @javafx.fxml.FXML
    public void referProgram(ActionEvent actionEvent) {
        messageLabel.setText("Refer your code to friends. You'll earn ₹50 when they sign up using it!");
    }

    @javafx.fxml.FXML
    public void redeemRewards(ActionEvent actionEvent) {
        if (rewardClaimed) {
            messageLabel.setText("Your ₹100 bonus has been redeemed successfully.");
            bonusLabel.setText("Total Bonus: ₹0");
            rewardClaimed = false;
        } else {
            messageLabel.setText("No rewards available to redeem.");
        }
    }

    @javafx.fxml.FXML
    public void share(ActionEvent actionEvent) {
        String message = "Share this code with friends: " + personalReferralCode;
        messageLabel.setText(message);
        System.out.println("Sharing referral code: " + personalReferralCode);
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentDashboard");
    }
}