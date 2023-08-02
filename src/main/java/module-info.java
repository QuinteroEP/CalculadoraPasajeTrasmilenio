module com.pabloqc.transmilenio {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pabloqc.transmilenio to javafx.fxml;
    exports com.pabloqc.transmilenio;
}