package level1.exercise2.interfaces;

import level1.exercise2.model.Pizza;

public interface IbuilderPizza {

    void reset();
    void buildSize();
    void buildDough();
    void buildTopping();
    Pizza build();
}
