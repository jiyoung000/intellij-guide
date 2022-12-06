module com.jojoidu.inflearn.intellijguide {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jojoidu.inflearn.intellijguide to javafx.fxml;
    exports com.jojoidu.inflearn.intellijguide;
}