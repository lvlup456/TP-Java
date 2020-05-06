package sample;

import albumphoto.Album;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class Visionneuse extends Application {

    BorderPane root = new BorderPane();
    Album album = new Album("img");
    ImageView imageView;
    Slider slider;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Plein des joiles photos");
        root.setCenter(creerCentre());
        root.setRight(creerSlider());
        root.setLeft(creerListe());


        primaryStage.setScene(new Scene(root,1000,700));
        primaryStage.show();
    }

    public FlowPane creerCentre(){

        imageView = new ImageView();
        FlowPane flow = new FlowPane(imageView);
        imageView.setImage(album.getPhotoCourante().getImage());

        flow.setPrefSize(600,450);
        flow.setAlignment(Pos.CENTER);

        return flow;
    }

    public Slider creerSlider(){
        slider = new Slider(0,100,1);
        slider.setValue(100);
        slider.setOrientation(Orientation.VERTICAL);
        slider.setMinorTickCount(10);
        slider.setMajorTickUnit(100);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);

        slider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                album.redimensionnerPhotoCourante(newValue.floatValue());
                imageView.setImage(album.getPhotoCourante().getImage());
                imageView.setFitHeight(album.getPhotoCourante().getHauteur());
                imageView.setFitWidth(album.getPhotoCourante().getLargeur());

            }
        });



        return slider;
    }

    public ListView<String> creerListe(){

        String tab[] = new String[album.getSize()];
        for (int i = 0; i < album.getSize(); i++){
            tab[i] = album.getPhoto(i).getNom();
        }
        ListView<String> liste = new ListView<String>(FXCollections.observableArrayList(tab));

        liste.getSelectionModel().select(album.getIndexCourant());
        liste.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        liste.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                album.setIndexCourant( liste.getSelectionModel().getSelectedIndex());
                imageView.setImage(album.getPhotoCourante().getImage());
                slider.setValue(album.getPhotoCourante().getZoom());
                imageView.setFitHeight(album.getPhotoCourante().getHauteur());
                imageView.setFitWidth(album.getPhotoCourante().getLargeur());
            }
        });

        return liste;
    }

    public BorderPane creerBandeauBas(){
        BorderPane border = border = new BorderPane();


        return border;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
