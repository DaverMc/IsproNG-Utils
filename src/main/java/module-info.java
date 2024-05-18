module dn.isprong.isproutils {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires eu.hansolo.tilesfx;

    opens dn.isprong.isproutils to javafx.fxml;
    exports dn.isprong.isproutils;
}