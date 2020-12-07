package SortAlgorithStrategy.controller;

import SortAlgorithStrategy.BubbleSort;
import SortAlgorithStrategy.ElementList;
import SortAlgorithStrategy.InsertionSort;
import SortAlgorithStrategy.SelectionSort;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {
    public ElementList el;
    public Button merge;
    public Button bubble;
    public Button insertion;
    public TextField nonOrdinato;
    public TextField ordinato;

    public void setSelectionSort(MouseEvent mouseEvent) {
        el = new ElementList();
        nonOrdinato.setText(String.valueOf(el));
        el.setSort(new SelectionSort());
        el.getSortedAlgorithm();
        el.stampa();
        ordinato.setText(String.valueOf(el));
    }

    public void setBubbleSort(MouseEvent mouseEvent) {
        el = new ElementList();
        nonOrdinato.setText(String.valueOf(el));
        el.setSort(new BubbleSort());
        el.getSortedAlgorithm();
        el.stampa();
        ordinato.setText(String.valueOf(el));
    }

    public void SetInsertionSort(MouseEvent mouseEvent) {
        el = new ElementList();
        nonOrdinato.setText(String.valueOf(el));
        el.setSort(new InsertionSort());
        el.getSortedAlgorithm();
        el.stampa();
        ordinato.setText(String.valueOf(el));
    }
}
