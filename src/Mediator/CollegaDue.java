package Mediator;

public class CollegaDue extends Collega {

    private String nickName;
    private Mediatore mediatore;

    public CollegaDue(String nickName, Mediatore mediatore) {
        this.nickName = nickName;
        this.mediatore = mediatore;

        this.mediatore.aggiungi(this);
    }

    @Override
    public void invia(String mess, String nickDest) {
        mediatore.inviaERicevi(nickName, mess, nickDest);
    }

    @Override
    public String getNickName() {
        return nickName;
    }

    @Override
    public void ricevi(String mess, String nickMittente) {
        System.out.println(nickMittente + " ->"+ this.nickName + " : "+ mess);
    }
}
