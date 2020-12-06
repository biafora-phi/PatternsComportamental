package ChainsOfResponsability;

public class Generale extends Ufficiale {
    @Override
    public void check(int stipendio) {
        if(stipendio > 5000){
            System.out.println("Stipendio percepito da nessun ufficiale (stipendio troppo alto)");
        }
        else
            System.out.println("stipendio percepito da "+ this.getClass().getSimpleName());
    }
}
