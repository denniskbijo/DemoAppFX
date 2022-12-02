module com.example.demoappfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demoappfx to javafx.fxml;
    exports com.example.demoappfx;
}