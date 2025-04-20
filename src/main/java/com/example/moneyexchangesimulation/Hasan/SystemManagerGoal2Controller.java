package com.example.moneyexchangesimulation.Hasan;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.io.IOException;

public class SystemManagerGoal2Controller
{
    @javafx.fxml.FXML
    private Label updateStatusLabel;
    @javafx.fxml.FXML
    private ComboBox<String> roleComboBox;
    @javafx.fxml.FXML
    private ListView<String> userListView;

    @javafx.fxml.FXML
    public void initialize() {
        ObservableList<String> users = FXCollections.observableArrayList(
                "Hasan (Cashier)",
                "Kamal (Admin)",
                "Rafique (Viewer)",
                "Joy (Cashier)"
        );
        userListView.setItems(users);
        roleComboBox.getItems().addAll("Admin", "Cashier", "Viewer");
    }

    @javafx.fxml.FXML
    public void saveRoleChanges(ActionEvent actionEvent) {
        String selectedUser = userListView.getSelectionModel().getSelectedItem();
        String newRole = roleComboBox.getValue();

        if (selectedUser == null || newRole == null) {
            updateStatusLabel.setText("Please select a user and a new role.");
            return;
        }

        String updatedUser = selectedUser.split(" ")[0] + " (" + newRole + ")";
        int selectedIndex = userListView.getSelectionModel().getSelectedIndex();
        userListView.getItems().set(selectedIndex, updatedUser);

        updateStatusLabel.setText("Role updated to " + newRole);
    }

    @javafx.fxml.FXML
    public void goToDashboard(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Hasan/systemManagerDashboard");
    }
}