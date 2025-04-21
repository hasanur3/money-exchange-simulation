package com.example.moneyexchangesimulation.Hasan;

import javafx.event.ActionEvent;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.io.IOException;

public class SystemManagerGoal7Controller
{
    @javafx.fxml.FXML
    private BarChart performanceChart;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void fetchMetrics(ActionEvent actionEvent) {
        performanceChart.getData().clear();

        XYChart.Series<String, Number> data = new XYChart.Series<>();
        data.setName("Current Usage");
        data.getData().add(new XYChart.Data<>("CPU", 75));
        data.getData().add(new XYChart.Data<>("Memory", 60));
        data.getData().add(new XYChart.Data<>("Response Time", 80));

        performanceChart.getData().add(data);
        statusLabel.setText("Metrics fetched successfully.");
    }

    @javafx.fxml.FXML
    public void optimizeSystem(ActionEvent actionEvent) {
        statusLabel.setText("System optimized for better performance.");
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerDashboard");
    }
}