package Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Raccolta extends ArrayList<Item> {

    public Raccolta() {
        super();
    }

    public  Iteratore getIteratoreNummerico(){
        return new IteratoreNummerico(this);
    }

    public  Iteratore getIteratoreStringga(){
        return new IteratoreStringga(this);
    }

    public void aggiungi(Item i){
        this.add(i);
    }

    public void rimuovi(int i){
        this.remove(i);
    }

    public Item getElemento(int i){
        return this.get(i);
    }

}
