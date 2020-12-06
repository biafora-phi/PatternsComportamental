package Interpreter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Contesto {

    private Stack numeri = null;
    private Stack operazioni = null;

    public Contesto(String s){
        this.numeri = new Stack();
        this.operazioni = new Stack();

        for(String t : revOp(s)){
            if(t.equals("+"))
                operazioni.add(new Addizione());
            else if(t.equals("-"))
                operazioni.add(new Sottrazione());
            else if(t.equals("*"))
                operazioni.add(new Moltiplicazione());
            else if(t.equals("/"))
                operazioni.add(new Divisione());
            else
                numeri.add(new Numero(t));
        }
    }

    public Object getNumero(){
        return numeri.pop();
    }

    public void setNumero(Espressione exp){
        numeri.push(exp);
    }

    public Object getOperatore(){
        return operazioni.pop();
    }

    private String[] revOp(String s){
        List l = Arrays.asList(s.split(" "));
        Collections.reverse(l);
        return (String[]) l.toArray();
    }
}
