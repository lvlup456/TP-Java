package Controller;

import Abstraction.Album;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;

import java.util.Observable;
import java.util.Observer;

public class ControllerSlider implements Observer, ChangeListener<Number> {

    Album album;
    Slider slider;
    ImageView imageCentrale;

    public ControllerSlider(Album album, Slider slider, ImageView imageCentrale) {
        this.album = album;
        this.slider = slider;
        this.imageCentrale = imageCentrale;
    }

    @Override
    public void update(Observable observable, Object o) {
        if (((Integer) o).equals(Album.CHANGEMENT_IMAGE_COURANTE)){
            slider.setValue(album.getPhotoCourante().getZoom());
        }

    }

    @Override
    public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
        album.redimensionnerPhotoCourante((float) slider.getValue());
        imageCentrale.setImage(album.getPhotoCourante().getImage());
        imageCentrale.setFitWidth(album.getPhotoCourante().getLargeur());
        imageCentrale.setFitHeight(album.getPhotoCourante().getHauteur());
    }
}
