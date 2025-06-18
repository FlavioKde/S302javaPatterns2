package level2.exercise1.model;

import level2.exercise1.interfaces.Observer;

public class NasdaqMarket implements Observer {

    @Override
    public void update(){
        System.out.println("The composite index has fallen by 1.30%.");
    }
}

