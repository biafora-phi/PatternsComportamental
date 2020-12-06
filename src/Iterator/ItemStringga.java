package Iterator;

public class ItemStringga extends Item {

    private String contenuto;

    public ItemStringga(String contenuto) {
        this.contenuto = contenuto;
    }

    public String getContenuto() {

        return contenuto;
    }

    public void setContenuto(String contenuto) {
        this.contenuto = contenuto;
    }

    @Override
    public String toString() {
        return "Stringa :" + contenuto;
    }
}
