module hu.petrik.emberektablazat {
    requires javafx.controls;
    requires javafx.fxml;


    opens hu.petrik.emberektablazat to javafx.fxml;
    exports hu.petrik.emberektablazat;
}