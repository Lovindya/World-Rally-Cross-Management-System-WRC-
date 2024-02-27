module com.example.cw1601_java {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cw1601_java to javafx.fxml;
    exports com.example.cw1601_java;
}