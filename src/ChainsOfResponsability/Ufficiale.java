package ChainsOfResponsability;

public abstract class Ufficiale {

    Ufficiale ufficiale = null;

    public void setSuperiore(Ufficiale ufficiale){
        this.ufficiale = ufficiale;
    }

    public abstract void check(int stipendio);
}
