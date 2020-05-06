package sample;


import Abstraction.Album;
import Controller.*;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;

public class Main extends Application {


    Album album = new Album("img");
    ImageView imageCentrale;
    Slider slider;

    public FlowPane creerCentre(){
        imageCentrale = new ImageView(album.getPhotoCourante().getImage());
        FlowPane centerpane = new FlowPane(imageCentrale);
        centerpane.setPrefSize(600, 450);
        centerpane.setAlignment(Pos.CENTER);

        ControllerPhotoCentre cpc = new ControllerPhotoCentre(imageCentrale);
        album.addObserver(cpc);

        return centerpane;
    }

    public Slider creerSlider(){
        slider = new Slider(0,100,1);
        slider.setOrientation(Orientation.VERTICAL);
        slider.setMinorTickCount(10);
        slider.setMajorTickUnit(100);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setValue(album.getPhotoCourante().getZoom());

        ControllerSlider cs = new ControllerSlider(album,slider,imageCentrale);
        album.addObserver(cs);
        slider.valueProperty().addListener(cs);

        return slider;
    }

    public ListView<String> creerListe() {
        String[] listeNoms = new String[album.getSize()];
        for (int i=0; i< album.getSize();i++) {
            listeNoms[i] = album.getPhoto(i).getNom();
        }
        ListView<String> listView = new ListView<String>(FXCollections.observableArrayList(listeNoms));
        listView.getSelectionModel().select(album.getIndexCourant());
        listView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        ControllerListe cl = new ControllerListe(album,imageCentrale,slider,listView);

        listView.getSelectionModel().selectedItemProperty().addListener(cl);
        album.addObserver(cl);

        return listView;
    }

    public HBox creerBandeau(){

        HBox box = new HBox();
        for (int i = 0; i < album.getSize(); i++){
            Button btn = new Button();
            Image image = album.getPhoto(i).getImage();
            BackgroundImage bImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(100, 100, true, true, true, false));
            btn.setBackground(new Background(bImage));
            btn.setMinSize(100,100);
            if (i == album.getIndexCourant()){
                btn.setStyle("   -fx-border-color:blue; -fx-border-width: 3;");
            }
            ControllerButton cb = new ControllerButton(i,btn,album);
            album.addObserver(cb);
            btn.setOnAction(cb);
            box.getChildren().add(btn);

        }
        box.setPrefSize(600,100);
        box.setAlignment(Pos.CENTER);
        return box;
    }

    public HBox CreerBandeauHaud(){
        HBox box = new HBox();

        Button btnNext = new Button("suivant");
        Button btnPrev = new Button("precedent");

        ControllerButtonNext cbn = new ControllerButtonNext(1,album);
        ControllerButtonNext cbp = new ControllerButtonNext(-1,album);

        btnNext.setOnAction(cbn);
        btnPrev.setOnAction(cbp);

        box.getChildren().addAll(btnPrev,btnNext);

        box.setPrefSize(200,50);
        box.setAlignment(Pos.CENTER);
        return box;
    }

    public void start(Stage primaryStage){
        primaryStage.setTitle("Album photo");
        BorderPane borderpane = new BorderPane();
        borderpane.setCenter(creerCentre());
        borderpane.setRight(creerSlider());
        borderpane.setLeft(creerListe());
        borderpane.setBottom(creerBandeau());
        borderpane.setTop(CreerBandeauHaud());
        Scene scene = new Scene(borderpane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



