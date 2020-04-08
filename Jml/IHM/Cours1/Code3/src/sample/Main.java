package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private int NB_COL = 7;
    private int NB_LIG = 6;
    private Button[] dropBtn = new Button[NB_COL];
    private Button[][] grilleJeux = new Button[NB_COL][NB_LIG];


    @Override
    public void start(Stage primaryStage){
        GridPane pane = new GridPane();
        Scene scene = new Scene(pane);
        scene.getStylesheets().add("CSS/style.css");

        for (int i = 0; i < NB_COL; i++){
            dropBtn[i] = new Button();
            pane.add(dropBtn[i],i,1);
            dropBtn[i].setId("btnDrop");
        }
        for (int i = 0; i < NB_COL; i++){
            for (int j = 0; j < NB_LIG; j++) {
                grilleJeux[i][j] = new Button();
                pane.add(grilleJeux[i][j],i,j+2);
                grilleJeux[i][j].setId("btnJeux");
            }
        }

        grilleJeux[3][5].setId("btnJeuxRouge");
        grilleJeux[3][4].setId("btnJeuxRouge");
        grilleJeux[2][5].setId("btnJeuxjaune");
        grilleJeux[3][3].setId("btnJeuxjaune");


        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
