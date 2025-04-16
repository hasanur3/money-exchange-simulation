module com.example.moneyexchangesimulation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.moneyexchangesimulation to javafx.fxml;
    exports com.example.moneyexchangesimulation;
    opens com.example.moneyexchangesimulation.rashmi.Controller to javafx.fxml;
}