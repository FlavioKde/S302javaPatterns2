package level2.exercise1.model;

import level2.exercise1.event.EventMarketDTO;
import level2.exercise1.interfaces.Observer;
import java.time.format.DateTimeFormatter;

public class NyseMarket implements Observer {

    @Override
    public void update(EventMarketDTO eventMarketDTO) {
        if (!eventMarketDTO.getMarketIndex().equalsIgnoreCase("Nyse"))
            return;
        if (eventMarketDTO.getChangeType() == MarketChangeType.RISE && eventMarketDTO.getPercentage() > 1.0) {
            System.out.println("Nyse goes up " + eventMarketDTO.getPercentage() + "% at " + eventMarketDTO.getTimestamp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "this moment: " + eventMarketDTO.getDescription());
        } else if (eventMarketDTO.getChangeType() == MarketChangeType.FALL && eventMarketDTO.getPercentage() < -1.0) {
            System.out.println("Alert: Nyse abruptly falls " + eventMarketDTO.getPercentage() + "% at " + eventMarketDTO.getTimestamp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "this moment: " + eventMarketDTO.getDescription());
        } else {
            System.out.println("The Nasdaq remains stable " + eventMarketDTO.getPercentage()  +  "% at " + eventMarketDTO.getTimestamp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "this moment "+ eventMarketDTO.getDescription());
        }
    }
}