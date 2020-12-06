package ChainsOfResponsability;

public class Maggiore extends Ufficiale {
    @Override
    public void check(int stipendio) {
        if(stipendio > 2000){
            ufficiale.check(stipendio);
        }
        else
            System.out.println("Stipendio guadagnato da "+ this.getClass().getSimpleName());
    }
}
