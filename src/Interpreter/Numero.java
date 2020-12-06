package Interpreter;

public class Numero implements Espressione{

    private int numero;

    public Numero(String numero) {
        this.numero = Integer.parseInt(numero);
    }

    @Override
    public int interpreta(Contesto operazione) {
        return numero;
    }
}
