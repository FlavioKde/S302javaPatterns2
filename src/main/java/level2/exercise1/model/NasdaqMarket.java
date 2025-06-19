package level2.exercise1.model;

import level2.exercise1.event.EventMarketDTO;
import level2.exercise1.interfaces.Observer;

import java.time.format.DateTimeFormatter;

public class NasdaqMarket implements Observer {

    @Override
    public void update(EventMarketDTO eventMarketDTO){
        if(!eventMarketDTO.getMarketIndex().equalsIgnoreCase("Nasdaq"))
            return;

        if(eventMarketDTO.getChangeType() == MarketChangeType.FALL && eventMarketDTO.getPercentage() < -1.0){

            System.out.println("Alert: Nasdaq abruptly falls " + eventMarketDTO.getPercentage() + "% at " + eventMarketDTO.getTimestamp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "this moment: " + eventMarketDTO.getDescription());

        } else if (eventMarketDTO.getChangeType() == MarketChangeType.RISE && eventMarketDTO.getPercentage() > 1.1) {

            System.out.println("Nasdaq's composite goes up " + eventMarketDTO.getPercentage() +  "% at " + eventMarketDTO.getTimestamp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))+ " this moment "+ eventMarketDTO.getDescription());

        }else{

            System.out.println("The Nasdaq remains stable "+ eventMarketDTO.getPercentage()  +  "% at " + eventMarketDTO.getTimestamp().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")) + "this moment "+ eventMarketDTO.getDescription());
        }
    }
}


