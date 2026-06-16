module com.vtd.datproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.vtd.datproject to javafx.fxml;
    exports com.vtd.datproject;
}
