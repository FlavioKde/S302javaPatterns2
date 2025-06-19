package level2.exercise1.model;

import level2.exercise1.event.EventMarketDTO;
import level2.exercise1.interfaces.Observer;

public class NyseMarket implements Observer {

    @Override
    public void update(EventMarketDTO eventMarketDTO) {
        System.out.println("The Dow Jones Index has risen 0.38%");
    }
}
