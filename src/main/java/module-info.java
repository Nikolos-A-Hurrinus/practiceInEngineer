module org.example.testprojectengineering {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.testprojectengineering to javafx.fxml;
    exports org.example.testprojectengineering;
}