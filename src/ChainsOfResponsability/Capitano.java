package ChainsOfResponsability;

public class Capitano extends Ufficiale {
    @Override
    public void check(int stipendio) {
        if(stipendio > 1000){
            ufficiale.check(stipendio);
        }
        else
            System.out.println("Stipendio guadagnato da "+ this.getClass().getSimpleName());
    }
}
