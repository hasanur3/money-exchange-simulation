package com.example.moneyexchangesimulation.rashmi.Controller;

import com.example.moneyexchangesimulation.rashmi.ModelClass.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.io.IOException;

public class StudentGoal3Controller
{
    @javafx.fxml.FXML
    private Label tipsLabel;

    @javafx.fxml.FXML
    public void initialize() {
        tipsLabel.setText("Welcome! Explore finance blogs, tips, and videos to learn more.");
    }

    @javafx.fxml.FXML
    public void eduBlog(ActionEvent actionEvent) {
        tipsLabel.setText("Check out our latest blog: 'How Students Can Manage Finances Smartly!'");
    }

    @javafx.fxml.FXML
    public void subscribe(ActionEvent actionEvent) {
        tipsLabel.setText("Thank you for subscribing to our financial updates!");
        System.out.println("User subscribed to financial tips/newsletter.");
    }

    @javafx.fxml.FXML
    public void resources(ActionEvent actionEvent) {
        tipsLabel.setText("Visit our Resources page for student-friendly apps, guides, and tools!");
    }

    @javafx.fxml.FXML
    public void video(ActionEvent actionEvent) {
        tipsLabel.setText("Now playing: 'Top 5 Tips to Save Money as a Student' (Video coming soon!)");
    }

    @javafx.fxml.FXML
    public void logOut(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Login");
    }

    @javafx.fxml.FXML
    public void finTips(ActionEvent actionEvent) {
        tipsLabel.setText("💡 Financial Tip: Always track your spending and set a monthly budget!");
    }

    @javafx.fxml.FXML
    public void dashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("StudentDashboard");

    }
}