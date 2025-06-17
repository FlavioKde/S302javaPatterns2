package level1.exercise1.fluentJoshuaBloch.model;

import level1.exercise1.fluentJoshuaBloch.interfaces.IFluentBuilderPizza;

import java.util.ArrayList;
import java.util.List;

public class ConcretePizzaBarbecue implements IFluentBuilderPizza {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    @Override
    public IFluentBuilderPizza setSize(String size) {
        this.size = size;
        return this;
    }
    @Override
    public IFluentBuilderPizza setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public IFluentBuilderPizza addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public Pizza build() {

        List<String> allToppings = new ArrayList<>();
        allToppings.addAll(this.toppings);
        return new Pizza(size, dough, allToppings);
    }
}
