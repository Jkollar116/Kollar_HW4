module com.example.kollar_hw4 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.healthmarketscience.jackcess;
    requires java.sql;
    requires com.google.gson;
    requires json.simple;

    opens com.example.kollar_hw4 to  javafx.fxml,com.google.gson;
    exports com.example.kollar_hw4;
}