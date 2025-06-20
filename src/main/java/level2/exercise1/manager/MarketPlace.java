package level2.exercise1.manager;

import level2.exercise1.event.EventMarketDTO;
import level2.exercise1.interfaces.Observable;
import level2.exercise1.model.MarketChangeType;
import level2.exercise1.model.NasdaqMarket;
import level2.exercise1.model.NyseMarket;

import java.time.LocalDateTime;

public class MarketPlace {
    Observable eventBroker;

    public MarketPlace(Observable eventBroker){
        this.eventBroker = eventBroker;
    }

    public void runApp(){

        EventMarketDTO rise = new EventMarketDTO("Nasdaq", MarketChangeType.RISE,0.8, LocalDateTime.now(), "The Nasdaq composite, is quiet");
        EventMarketDTO fall = new EventMarketDTO("Nasdaq",MarketChangeType.FALL,-2.1, LocalDateTime.now(),"Strong down the Nasdaq composite, care, worst days can come");

        EventMarketDTO riseNyse = new EventMarketDTO("Nyse", MarketChangeType.RISE, 2.3, LocalDateTime.now(),"spectacular rise of the NYSE index");
        EventMarketDTO fallNyse = new EventMarketDTO("Nyse", MarketChangeType.FALL, -3.3, LocalDateTime.now(), "sharp fall of the stock market, after the start of the war in Iran");

        eventBroker.addObserver(new NasdaqMarket());
        eventBroker.addObserver(new NyseMarket());

        eventBroker.notifyObserver(rise);
        eventBroker.notifyObserver(fall);

        eventBroker.notifyObserver(riseNyse);
        eventBroker.notifyObserver(fallNyse);
    }

}
