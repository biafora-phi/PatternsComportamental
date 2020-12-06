package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatoreConcreto extends Mediatore{

    private List<Collega> colleghi = new ArrayList<Collega>();

    @Override
    public void aggiungi(Collega collega) {
        colleghi.add(collega);
    }

    @Override
    public void inviaERicevi(String nickMittente, String mess, String nickDest) {

        for(Collega colleghi : colleghi){
            if(colleghi.getNickName().equals(nickDest)){
                colleghi.ricevi(mess, nickMittente);
            }
        }
    }
}
