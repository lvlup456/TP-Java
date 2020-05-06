package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.net.URI;

public class Main extends Application {


    URI mp3URi = URI.create("file:/home/eisti/Perso/Ing1/Java/Jml/IHM/Cours2/Code2/test.mp3");
    Media music ;
    MediaPlayer mediaPlayer ;

    Slider slider = new Slider(0,1,0.01);
    Button play = new Button("Play");
    Button rewind = new Button("<<");
    Button openFile = new Button("choisir un morceau");
    FileChooser fileChooser = new FileChooser();


    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Media Player");
        HBox root = new HBox(4);
        root.getChildren().addAll(openFile,play,rewind,slider);
        slider.setValue(0.5);
        openFile(primaryStage);


        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (MediaPlayer.Status.PLAYING.equals(mediaPlayer.getStatus())){
                    mediaPlayer.pause();
                }else{
                    mediaPlayer.play();
                }
            }
        });

        openFile.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                openFile(primaryStage);
            }
        });

        mediaPlayer.volumeProperty().bind(slider.valueProperty());

        rewind.setOnAction(e -> mediaPlayer.seek(new Duration(0)));

        primaryStage.setScene(new Scene(root, 500, 60));
        primaryStage.show();
    }

    public void openFile(Stage primaryStage){
        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            music = new Media(file.toURI().toString());
            mediaPlayer = new MediaPlayer(music);
        }else{
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
