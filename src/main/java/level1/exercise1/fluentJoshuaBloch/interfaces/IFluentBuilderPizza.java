package level1.exercise1.fluentJoshuaBloch.interfaces;


import level1.exercise1.fluentJoshuaBloch.model.Pizza;

public interface IFluentBuilderPizza {
        IFluentBuilderPizza setSize(String size);
        IFluentBuilderPizza setDough(String dough);
        IFluentBuilderPizza addTopping(String topping);
        Pizza build();;
}
