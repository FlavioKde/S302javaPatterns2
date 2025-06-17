package level1.exercise2.model;

import level1.exercise2.interfaces.IbuilderPizza;

import java.util.List;

public class ConcretePizzaHawaiian implements IbuilderPizza {
    private Pizza pizza;

    public ConcretePizzaHawaiian(){
        this.reset();
    }
    @Override
    public void reset(){
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize(){
        pizza.setSize("Medium");
    }
    @Override
    public void buildDough(){
        pizza.setDough("American");
    }
    @Override
    public void buildTopping(){
        pizza.setTopping(List.of("pineapple","ham","mozzarella","tomato sauce"));
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}
