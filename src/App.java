import Pattern.ConcreteComman;
import Pattern.ConcreteReseiver;
import Pattern.Invoker;


public class App {
    public static void main(String[] args) throws Exception {
        Invoker invoker = new Invoker();
        ConcreteReseiver  reseiver =
        new ConcreteReseiver();

        invoker.executeComman(new Concretecomman(),reseiver);
        
    }
}
