package Interpreter;

public class Addizione implements Espressione{
    @Override
    public int interpreta(Contesto operazione) {
        int risultato = 0; //operazione.getNumero().interpreta(operazione) + operazione.getNumero().interpreta(operazione);
        operazione.setNumero(new Numero(risultato + ""));
        return risultato;
    }
}
