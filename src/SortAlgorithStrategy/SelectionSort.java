package SortAlgorithStrategy;

import java.util.List;
import java.util.jar.JarEntry;

public class SelectionSort implements SortAlgorithm{

    @Override
    public List sort(List l) {
        System.out.println("Selection sort");
        for (int i = 0; i < l.size(); i++) {
            int min = (int) l.get(i);
            int minId = i;
            for (int j = i+1; j < l.size(); j++) {
                if ((int) l.get(j) < min) {
                    min = (int) l.get(j);
                    minId = j;
                }
            }
            // swapping
            int temp = (int) l.get(i);
            l.set(i, min);
            l.set(minId, temp);

        }


        return l;
    }

}
