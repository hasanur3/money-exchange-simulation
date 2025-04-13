package com.example.moneyexchangesimulation.Hasan;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {
    public static Stage stage;

    public static void switchTo(String fxmlFileName) throws IOException {
        Parent root = FXMLLoader.load(SceneSwitcher.class.getResource(fxmlFileName + ".fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}