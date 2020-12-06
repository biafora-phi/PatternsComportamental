package visitor;

public class VisitorInfo implements Visitor {
    @Override
    public void visitorTelefono(Phone p) {
        System.out.println(p.getMarca() + p.getName() + p.getPeso());
    }

    @Override
    public void visitorCassa(Cassa p) {

    }

    @Override
    public void visitorAukey(PBAukey p) {

    }
}
