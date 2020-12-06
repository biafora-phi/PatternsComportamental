package Iterator;

public class IteratoreStringga implements Iteratore{

    private Raccolta raccolta;
    private int index;

    public IteratoreStringga(Raccolta raccolta) {
        this.raccolta = raccolta;
        this.index = -1;
    }

    @Override
    public boolean hasNext() {

        if(index >= raccolta.size())
            return false;
        for(int i = index+1; i < raccolta.size(); i++){
            if(raccolta.get(i) instanceof ItemStringga){
                index = i;
                return true;
            }
        }

        return false;
    }

    @Override
    public ItemStringga recuperaElemento() {
        return (ItemStringga) raccolta.get(index);
    }
}
