package Interpreter;

public class Client {

    public static void main(String[] args) {
        String op = "54 + 67 - 1 / 21 *2";
        Contesto c = new Contesto(op);

        int risultato = 0;
        while(true){
            try{

                Espressione oper = (Espressione) c.getOperatore();
                risultato = oper.interpreta(c);
            } catch (java.util.EmptyStackException e){
                break;
            }
        }

        System.out.println(op + " = "+ risultato);

    }

}
