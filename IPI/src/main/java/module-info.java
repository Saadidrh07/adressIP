module com.example.ipi {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.ipi to javafx.fxml;
    exports com.example.ipi;
    exports com.example.ipi.Controller;
    opens com.example.ipi.Controller to javafx.fxml;
}