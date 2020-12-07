package SortAlgorithStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ElementList {
    private List list;
    private SortAlgorithm s;

    public ElementList(){
        list = new ArrayList();
        Random r = new Random();
        for(int i = 0; i < 20; i++){
            list.add(r.nextInt(200));
        }
    }

    public void setSort(SortAlgorithm ss){
        s = ss;
    }

    public List getSortedAlgorithm(){
        return s.sort(list);
    }

    public void stampa(){
        for(int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    @Override
    public String toString() {
        return "list=" + list;
    }
}
