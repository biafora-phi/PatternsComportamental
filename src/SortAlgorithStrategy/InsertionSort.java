package SortAlgorithStrategy;

import java.util.List;

public class InsertionSort implements SortAlgorithm {
    @Override
    public List sort(List l) {
        System.out.println("Insertion sort");
        long start = System.currentTimeMillis();

        boolean isSorted = false; // Initially array is unsorted
        while (!isSorted){
            isSorted = true;
            int tmp =0;

            // Perform Bubble sort on odd indexed element
            for (int i=1; i<=l.size()-2; i=i+2){
                if((int)l.get(i) > (int)l.get(i+1)){
                    tmp = (int) l.get(i);
                    l.set(i, l.get(i+1));
                    l.set(i+1, tmp);
                    isSorted = false;
                }
            }
            // Perform Bubble sort on even indexed element
            for (int i=0; i<=l.size()-2; i=i+2) {
                if((int)l.get(i) > (int)l.get(i+1)){
                    tmp = (int) l.get(i);
                    l.set(i, l.get(i+1));
                    l.set(i+1, tmp);
                    isSorted = false;
                }
            }
        }

        
        long end = System.currentTimeMillis();
        System.out.println("Tempo impiegato: " + (end-start));
        return l;
    }
}
