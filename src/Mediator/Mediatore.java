package Mediator;

public abstract class Mediatore{

    public abstract void aggiungi(Collega collega);
    public abstract void inviaERicevi(String nickMittente, String mess, String nickDest);
}
