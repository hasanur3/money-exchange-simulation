module com.example.moneyexchangesimulation {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.moneyexchangesimulation to javafx.fxml;
    exports com.example.moneyexchangesimulation;
    opens com.example.moneyexchangesimulation.rashmi.Controller to javafx.fxml;
    opens com.example.moneyexchangesimulation.Hasan to javafx.fxml;
    opens com.example.moneyexchangesimulation.Israt_jahan_liya.Controller to javafx.fxml;
}