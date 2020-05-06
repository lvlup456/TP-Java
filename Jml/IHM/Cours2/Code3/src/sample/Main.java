package sample;

import com.sun.prism.Graphics;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.*;
import javafx.util.Pair;

import java.util.ArrayList;


public class Main extends Application {

    Canvas canvas = new Canvas(500,500);
    Button addAll = new Button("reliez tous les points");
    Button addOne = new Button("reliez les points pas a pas");
    int indexDraw = 0;

    ArrayList<Pair<Integer,Integer>> listePoints = new ArrayList<Pair<Integer,Integer>>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Ho WOW!!!");
        primaryStage.setResizable(false);
        HBox buttonBox = new HBox();
        VBox vbox = new VBox();

        GraphicsContext gc = canvas.getGraphicsContext2D();


        dessiner(gc);

        canvas.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                double x = mouseEvent.getSceneX();
                double y = mouseEvent.getSceneY();

                listePoints.add(new Pair<>(Integer.valueOf((int) x),Integer.valueOf((int) y)));
                dessiner(canvas.getGraphicsContext2D());
            }
        });


        addOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (listePoints.size() > 1 && indexDraw < listePoints.size()){
                    dessinerLigne(indexDraw,(indexDraw + 1) % listePoints.size());
                    indexDraw ++;
                }
            }
        });

        addAll.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                for (int i = indexDraw; i < listePoints.size(); i++){
                    dessinerLigne(i,(i + 1) % listePoints.size());
                }
                indexDraw = listePoints.size();
            }
        });

        buttonBox.getChildren().addAll(addOne,addAll);
        vbox.getChildren().addAll(canvas,buttonBox);


        primaryStage.setScene(new Scene(vbox, 500, 600));
        primaryStage.show();
    }

    public void dessiner(GraphicsContext gc){
        gc.setFill(Color.WHITE);
        gc.fillRect(0,0,500,500);


        int i = 0;
        for (Pair paire : listePoints){
            gc.strokeText(Integer.toString(i),Integer.parseInt(paire.getKey().toString()),Integer.parseInt(paire.getValue().toString()));
            i ++;
        }

        if (indexDraw != 0 && indexDraw == listePoints.size()-1) indexDraw --;
        for (i = 0; i < indexDraw; i++){
            dessinerLigne(i,(i + 1) % listePoints.size());
        }

    }

    public void dessinerLigne(int i,int j){
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Pair<Integer,Integer> p1 = listePoints.get(i);
        Pair<Integer,Integer> p2 = listePoints.get(j);

        gc.setStroke(Color.BLACK);
        gc.strokeLine(p1.getKey().doubleValue(), p1.getValue().doubleValue(),p2.getKey().doubleValue(),p2.getValue().doubleValue());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
