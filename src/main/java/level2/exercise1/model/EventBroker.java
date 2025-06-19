package level2.exercise1.model;
import level2.exercise1.event.EventMarketDTO;
import level2.exercise1.interfaces.Observable;
import level2.exercise1.interfaces.Observer;
import java.util.HashSet;


public class EventBroker implements Observable {
    HashSet<Observer>marketObserver = new HashSet<>();


    @Override
    public void addObserver(Observer observer){
            marketObserver.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer){
            marketObserver.remove(observer);
    }

    @Override
    public void notifyObserver(EventMarketDTO eventMarketDTO){
            for(Observer observer : marketObserver){
                observer.update(eventMarketDTO);
            }
    }

}
