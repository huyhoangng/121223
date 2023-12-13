package demo1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main2 extends Application {
    public static Stage rootStage;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        rootStage= primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("javafx/home.fxml"));
        primaryStage.setScene(new Scene(root,830,550));
        primaryStage.setTitle("JavaFX Demo");
        primaryStage.show();
    }

}