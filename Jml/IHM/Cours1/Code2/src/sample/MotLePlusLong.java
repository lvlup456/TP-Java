package sample;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MotLePlusLong {

    private String[] listeMots = {"est","ets","ste"};
    private String mot = "est";
    VBox vbox = new VBox(2);
    GridPane gridPane = new GridPane();
    BorderPane borderPane = new BorderPane();

    public MotLePlusLong() {

        TextField textField = new TextField(mot);
        ListView listView = new ListView<String>();
        Label label = new Label("coucou");
        label.setTooltip(new Tooltip("tralalalalall pouetetet"));

        for(String mot : listeMots){
            listView.getItems().add("test");
        }

        vbox.getChildren().add(textField);
        vbox.getChildren().add(listView);

        gridPane.add(textField,1,1);
        gridPane.add(listView,2,2);
        gridPane.add(label,3,3);

        borderPane.setTop(textField);
        borderPane.setLeft(label);
        borderPane.setRight(listView);

    }

    public VBox getVbox() {
        return vbox;
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public BorderPane getBorderPane() {
        return borderPane;
    }
}
