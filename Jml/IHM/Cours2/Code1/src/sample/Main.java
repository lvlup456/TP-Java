package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Button bouton;
    Button bouton2;
    Button bouton3;

    @Override
    public void start(Stage primaryStage) throws Exception{


        primaryStage.setTitle("les jolies compteurs");

        bouton = new Button("0");
        bouton2 = new Button("0");
        bouton3 = new Button("0");

        bouton.setPrefSize(100,100);
        bouton2.setPrefSize(100,100);
        bouton3.setPrefSize(100,100);

        bouton.setOnAction(new btnHandler());
        bouton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                bouton2.setText("" + (Integer.parseInt(bouton2.getText()) + 1));
            }
        });
        bouton3.setOnAction(e -> bouton3.setText("" + (Integer.parseInt(bouton3.getText()) + 1)));

        VBox vbox = new VBox();
        vbox.getChildren().addAll(bouton,bouton2,bouton3);

        Scene scene = new Scene(vbox);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class btnHandler implements EventHandler<ActionEvent>{
        @Override
        public void handle(ActionEvent event){
            bouton.setText(String.valueOf(Integer.valueOf(bouton.getText()) + 1));
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
