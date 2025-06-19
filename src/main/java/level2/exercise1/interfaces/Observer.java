package level2.exercise1.interfaces;

import level2.exercise1.event.EventMarketDTO;

public interface Observer {
    void update(EventMarketDTO eventMarketDTO);
}
