module com.example._09_cdio_roborally {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example._09_cdio_roborally to javafx.fxml;
    exports com.example._09_cdio_roborally;
}