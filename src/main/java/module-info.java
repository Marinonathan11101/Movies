module com.example.movies {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;


    opens com.example.movies to javafx.fxml;
    exports com.example.movies;
}