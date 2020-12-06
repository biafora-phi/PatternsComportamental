package TavolettaMemento.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {
    public Button b;
    public Label l;

    public void initialize(){
        l.setVisible(false);
    }

    public void click(MouseEvent mouseEvent) {
    }

    public void buttonClick(ActionEvent actionEvent) {
        l.setVisible(true);
    }
}
