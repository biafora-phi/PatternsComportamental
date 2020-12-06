package Iterator;

public class Main {

    public static void main(String[] args) {
        Raccolta raccolta = new Raccolta();

        //raccolta.aggiungi(new ItemNummerico(10));
        //raccolta.aggiungi(new ItemNummerico(20));
        raccolta.aggiungi(new ItemStringga("CIAO"));
        //raccolta.aggiungi(new ItemNummerico(45326780));
        raccolta.aggiungi(new ItemStringga("CIAOSPATARO"));

        Iteratore i = raccolta.getIteratoreNummerico();
        Iteratore ii = raccolta.getIteratoreStringga();

        while (i.hasNext()){
            System.out.println(i.recuperaElemento());
        }

        while (ii.hasNext()){
            System.out.println(ii.recuperaElemento());
        }



    }
}
