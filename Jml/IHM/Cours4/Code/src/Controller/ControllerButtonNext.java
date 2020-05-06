package Controller;

import Abstraction.Album;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

import java.util.Observable;
import java.util.Observer;

public class ControllerButtonNext implements Observer, EventHandler<ActionEvent> {

    int mod;
    Album album;


    public ControllerButtonNext(int mod, Album album) {
        this.mod = mod;
        this.album = album;
    }

    @Override
    public void update(Observable observable, Object o) {

    }


    @Override
    public void handle(ActionEvent actionEvent) {
        int index = album.getIndexCourant() + mod;
        if (index >= 0 && index <= album.getSize()){
            album.setIndexCourant(album.getIndexCourant() + mod);
        }
    }
}
