package SortAlgorithStrategy;

import java.util.List;

public class BubbleSort implements SortAlgorithm {
    @Override
    public List sort(List l) {
        System.out.println("Bullble sort");
        long start = System.currentTimeMillis();
        for(int i = 0; i < l.size(); i++) {
            boolean flag = false;
            for(int j = 0; j < l.size()-1; j++) {
                //Se l' elemento j e maggiore del successivo allora
                //scambiamo i valori
                int first = (int) l.get(j);
                int second = (int) l.get(j+1);
                if(first > second) {
                    int k = (int) l.get(j);
                    l.set(j, j+1);
                    l.set(j+1, k);
                    flag=true; //Lo setto a true per indicare che é avvenuto uno scambio
                }
            }
            if(!flag) break; //Se flag=false allora vuol dire che nell' ultima iterazione
            //non ci sono stati scambi, quindi il metodo può terminare
            //poiché l' array risulta ordinato
        }
        long end = System.currentTimeMillis();
        System.out.println("Tempo impiegato: " + System.currentTimeMillis() + "  "+ start + "  "+ end);
        return l;
    }
}
