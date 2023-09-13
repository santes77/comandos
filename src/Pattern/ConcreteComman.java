package Pattern;

public class ConcreteComman extends Comman {

    private Reseiver reseiver ;

    @Override
    public void execute(Reseiver receiver) {
    receiver.doAction();
    this.reseiver = receiver;
    }
    



    
    
}
