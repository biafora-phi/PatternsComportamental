package Mediator;

public abstract class Collega {

    public abstract void invia(String mess, String nickDest);

    public abstract String getNickName();

    public abstract void ricevi(String mess, String nickMittente);
}
