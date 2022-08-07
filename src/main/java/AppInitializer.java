import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL splashResource = this.getClass().getResource("/view/SplashScreen.fxml");
        Parent splashContainer = FXMLLoader.load(splashResource);
        Scene splashScene = new Scene(splashContainer);
        splashScene.setFill(Color.TRANSPARENT);  // Transparent the scene
//        Stage stage = new Stage(StageStyle.TRANSPARENT);  // StageStyle.TRANSPARENT  // Also we can use this
        primaryStage.setScene(splashScene); // Set scene to stage
        primaryStage.initStyle(StageStyle.TRANSPARENT);  // Title bar transparent
        primaryStage.centerOnScreen();
        primaryStage.show();
    }
}
