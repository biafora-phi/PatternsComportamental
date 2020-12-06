package ChainsOfResponsability;

public class Colonello extends Ufficiale{
    @Override
    public void check(int stipendio) {
        if(stipendio > 4000){
            ufficiale.check(stipendio);
        }
        else
            System.out.println("Stipendio guadagnato da "+ this.getClass().getSimpleName());
    }
}
