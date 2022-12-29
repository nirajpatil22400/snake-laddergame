module com.example.snakeladder21dec {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snakeladder21dec to javafx.fxml;
    exports com.example.snakeladder21dec;
}