package ChainsOfResponsability;

public class Tenente extends Ufficiale{
    @Override
    public void check(int stipendio) {
        if(stipendio > 3000){
            ufficiale.check(stipendio);
        }
        else
            System.out.println("Stipendio guadagnato da "+ this.getClass().getSimpleName());
    }
}
