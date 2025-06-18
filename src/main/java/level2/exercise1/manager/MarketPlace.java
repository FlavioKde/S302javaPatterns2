package level2.exercise1.manager;

import level2.exercise1.model.EventBroker;
import level2.exercise1.model.NasdaqMarket;

public class MarketPlace {
    EventBroker eventBroker;

    public MarketPlace(EventBroker eventBroker){
        this.eventBroker = eventBroker;
    }

    public void runApp(){
        EventBroker eventBroker1 = new EventBroker();
        eventBroker1.addObserver(new NasdaqMarket());
        eventBroker1.notifyObserver();
    }

}
