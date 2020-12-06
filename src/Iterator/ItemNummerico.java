package Iterator;

public class ItemNummerico extends Item {

    private int contenuto;

    public ItemNummerico(int contenuto) {
        this.contenuto = contenuto;
    }

    public int getContenuto() {
        return contenuto;
    }

    public void setContenuto(int contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {

        return "Numerico :" + contenuto;
    }
}
