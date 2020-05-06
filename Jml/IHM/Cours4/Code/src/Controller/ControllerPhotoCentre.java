package Controller;

import Abstraction.Album;
import javafx.scene.image.ImageView;

import java.util.Observable;
import java.util.Observer;

public class ControllerPhotoCentre implements Observer {
    ImageView imageCentre;
    public ControllerPhotoCentre(ImageView imageCentre) {
        this.imageCentre = imageCentre;
    }

    @Override
    public void update(Observable observable, Object o) {
        if ( ((Integer) o).equals(Album.CHANGEMENT_IMAGE_COURANTE) ){
            this.imageCentre.setImage(((Album) observable).getPhotoCourante().getImage());
        }
        if ( ((Integer) o).equals(Album.CHANGEMENT_IMAGE_COURANTE) ){
            imageCentre.setFitWidth(((Album) observable).getPhotoCourante().getLargeur());
            imageCentre.setFitHeight(((Album) observable).getPhotoCourante().getHauteur());
        }

    }
}
