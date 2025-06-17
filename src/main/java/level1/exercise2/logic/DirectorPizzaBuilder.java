package level1.exercise2.logic;

import level1.exercise2.interfaces.IbuilderPizza;
import level1.exercise2.model.Pizza;

public class DirectorPizzaBuilder {

    public Pizza construct(IbuilderPizza ibuilderPizza){
        ibuilderPizza.buildSize();
        ibuilderPizza.buildDough();
        ibuilderPizza.buildTopping();
        return ibuilderPizza.build();
    }
}
