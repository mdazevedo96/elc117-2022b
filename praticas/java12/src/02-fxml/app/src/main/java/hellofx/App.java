package hellofx;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("primary.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480,160);
        scene.getRoot().setStyle("-fx-font-family: 'sans-serif'");
        stage.setScene(scene);
        stage.setTitle("First FXML Example");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}