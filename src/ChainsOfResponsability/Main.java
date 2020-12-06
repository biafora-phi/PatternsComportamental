package ChainsOfResponsability;

public class Main {
    public static void main(String[] args) {
        Capitano capitano = new Capitano();
        Maggiore maggiore = new Maggiore();
        Tenente tenente = new Tenente();
        Colonello colonello = new Colonello();
        Generale generale = new Generale();

        //creo la gerarchia di seguito
        capitano.setSuperiore(maggiore);
        maggiore.setSuperiore(tenente);
        tenente.setSuperiore(colonello);
        colonello.setSuperiore(generale);

        System.out.println("Chi guadagna 2500 euro mensili?");
        capitano.check(2500);
    }
}
