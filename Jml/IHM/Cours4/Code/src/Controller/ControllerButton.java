package Controller;

import Abstraction.Album;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.util.Observable;
import java.util.Observer;

public class ControllerButton implements Observer, EventHandler<ActionEvent> {

    int index;
    Button btn;
    Album album;


    public ControllerButton(int index, Button btn, Album album) {
        this.index = index;
        this.btn = btn;
        this.album = album;
    }

    @Override
    public void update(Observable observable, Object o) {
        if (((Integer) o).equals(Album.CHANGEMENT_IMAGE_COURANTE)) {
            btn.setStyle(null);
            if (index == album.getIndexCourant()){
                btn.setStyle("   -fx-border-color:blue; -fx-border-width: 3;");
            }
        }
    }


    @Override
    public void handle(ActionEvent actionEvent) {
        album.setIndexCourant(index);
    }
}
