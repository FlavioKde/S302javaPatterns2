package level2.exercise1.model;

import java.util.Observable;

public class Broker {

    public class StockMarketEvent{

        private Broker broker;
        private double stockMarketFalls;
        private double stockMarketRises;

        public StockMarketEvent(Broker broker, double stockMarketFalls, double stockMarketRises){
            this.broker = broker;
            this.stockMarketFalls = stockMarketFalls;
            this.stockMarketRises = stockMarketRises;
        }

        public Broker getBroker() {
            return broker;
        }

        public double getStockMarketFalls() {
            return stockMarketFalls;
        }

        public double getStockMarketRises() {
            return stockMarketRises;
        }
    }
}
