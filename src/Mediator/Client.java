package Mediator;

public class Client {

    public static void main(String[] args) {
        Mediatore mediatore = new MediatoreConcreto();

        Collega a = new CollegaUno("Giulia", mediatore);
        Collega b = new CollegaDue("Giacomo", mediatore);
        a.invia("Ciao Giacomo, come stai?", "Giacomo");
        b.invia("Ciao Giulia, tutto bene e tu?", "Giulia");
        a.invia("Bene", "Giacomo");
    }

}
