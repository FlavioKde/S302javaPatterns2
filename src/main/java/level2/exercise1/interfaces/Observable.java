package level2.exercise1.interfaces;

import level2.exercise1.event.EventMarketDTO;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver(EventMarketDTO eventMarketDTO);
}
