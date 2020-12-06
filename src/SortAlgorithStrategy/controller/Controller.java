package SortAlgorithStrategy.controller;

import SortAlgorithStrategy.BubbleSort;
import SortAlgorithStrategy.ElementList;
import SortAlgorithStrategy.InsertionSort;
import SortAlgorithStrategy.SelectionSort;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Controller {
    public ElementList el;
    public Button merge;
    public Button bubble;
    public Button insertion;

    public void setSelectionSort(MouseEvent mouseEvent) {
        el = new ElementList();
        el.setSort(new SelectionSort());
        el.getSortedAlgorithm();
        el.stampa();
    }

    public void setBubbleSort(MouseEvent mouseEvent) {
        el = new ElementList();
        el.setSort(new BubbleSort());
        el.getSortedAlgorithm();
        el.stampa();
    }

    public void SetInsertionSort(MouseEvent mouseEvent) {
        el = new ElementList();
        el.setSort(new InsertionSort());
        el.getSortedAlgorithm();
        el.stampa();
    }
}
