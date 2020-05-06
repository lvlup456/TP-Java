package Controller;

import Abstraction.Album;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

import java.util.Observable;
import java.util.Observer;

public class ControllerListe implements Observer, ChangeListener<String> {

    Album album;
    ImageView imageCentrale;
    Slider slider;
    ListView<String> listView;

    public ControllerListe(Album album, ImageView imageCentrale, Slider slider, ListView<String> listView) {
        this.album = album;
        this.imageCentrale = imageCentrale;
        this.slider = slider;
        this.listView = listView;
    }

    @Override
    public void update(Observable observable, Object o) {
        if (((Integer) o).equals(Album.CHANGEMENT_IMAGE_COURANTE)) {
            listView.getSelectionModel().select(album.getIndexCourant());
        }
    }

    @Override
    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
        album.setIndexCourant( listView.getSelectionModel().getSelectedIndex());
        imageCentrale.setImage(album.getPhotoCourante().getImage());
        slider.setValue(album.getPhotoCourante().getZoom());
        imageCentrale.setFitHeight(album.getPhotoCourante().getHauteur());
        imageCentrale.setFitWidth(album.getPhotoCourante().getLargeur());
    }
}
