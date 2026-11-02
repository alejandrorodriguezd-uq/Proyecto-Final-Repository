module uniquindio.edu.co.cinemafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens uniquindio.edu.co.cinemafx to javafx.fxml;
    exports uniquindio.edu.co.cinemafx;
}