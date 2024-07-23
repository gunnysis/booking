module toyproject.bookingsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens toyproject.bookingsystem to javafx.fxml;
    exports toyproject.bookingsystem;
}