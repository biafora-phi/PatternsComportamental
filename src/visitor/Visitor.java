package visitor;

public interface Visitor {

    void visitorTelefono(Phone p);
    void visitorCassa(Cassa p);
    void visitorAukey(PBAukey p);
}
