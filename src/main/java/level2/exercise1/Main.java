package level2.exercise1;

import level2.exercise1.manager.MarketPlace;
import level2.exercise1.model.EventBroker;


public class Main {
    public static void main(String[] args) {

        MarketPlace marketPlace = new MarketPlace(new EventBroker());
        marketPlace.runApp();
    }
}
