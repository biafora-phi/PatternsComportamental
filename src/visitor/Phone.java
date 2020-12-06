package visitor;

public class Phone extends Device {

    public Phone(String name){
        this.name = name;
        peso = 1.0f;
        marca = "Huwawei";

        azione();
    }
    @Override
    public void acept(Visitor v) {
        System.out.println("Telefono acceso");

    }

    @Override
    public void azione() {

    }
}
