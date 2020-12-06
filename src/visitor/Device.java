package visitor;

public abstract class Device {

    protected String name;
    protected float peso;
    protected String marca;

    public abstract void acept(Visitor v);

    public abstract void azione();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
