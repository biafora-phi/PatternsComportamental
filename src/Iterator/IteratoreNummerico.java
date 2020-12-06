package Iterator;

public class IteratoreNummerico  implements Iteratore{

    private Raccolta raccolta;
    private int index;

    public IteratoreNummerico(Raccolta raccolta) {
        this.raccolta = raccolta;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {

        if(index >= raccolta.size())
            return false;
        for(int i = index+1; i < raccolta.size(); i++){
                if(raccolta.get(i) instanceof ItemNummerico){
                    index = i;
                    return true;
                }
        }

        return false;
    }

    @Override
    public ItemNummerico recuperaElemento() {
        return (ItemNummerico) raccolta.get(index);
    }
}
