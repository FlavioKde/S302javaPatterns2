package level2.exercise1;

import level2.exercise1.manager.MarketPlace;
import level2.exercise1.model.EventBroker;
import level2.exercise1.model.NasdaqMarket;

public class Main {
    public static void main(String[] args) {
        /*
        EventBroker eventBroker = new EventBroker();
        eventBroker.addObserver(new NasdaqMarket());

        eventBroker.notifyObserver();

         */
        MarketPlace marketPlace = new MarketPlace(new EventBroker());
        marketPlace.runApp();
    }
}
