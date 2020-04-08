package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("mon jolie btn");

        Button bouton =new Button("coucou");


        Scene scene = new Scene(bouton);

        bouton.setPrefSize(400,100);

        scene.getStylesheets().add("/CSS/boutton.css");
        bouton.setId("monBtn");


        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
