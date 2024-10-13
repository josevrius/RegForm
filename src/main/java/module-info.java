module org.jvrb.java.regform {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens org.jvrb.java.regform to javafx.fxml;
    exports org.jvrb.java.regform;
}