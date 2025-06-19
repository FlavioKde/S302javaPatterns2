package level2.exercise1.event;
import level2.exercise1.model.MarketChangeType;
import java.time.LocalDateTime;

public class EventMarketDTO {
    private String marketIndex;
    private MarketChangeType changeType;
    private double percentage;
    private LocalDateTime timestamp;
    private String description;


    public EventMarketDTO(String marketIndex, MarketChangeType changeType,double percentage,
                          LocalDateTime timestamp, String description){
        this.marketIndex = marketIndex;
        this.changeType = changeType;
        this.percentage = percentage;
        this.timestamp = timestamp;
        this.description = description;
    }

    public String getMarketIndex() {
        return marketIndex;
    }

    public MarketChangeType getChangeType() {
        return changeType;
    }

    public double getPercentage() {
        return percentage;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getDescription() {
        return description;
    }


}
