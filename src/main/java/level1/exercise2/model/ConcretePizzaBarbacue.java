package level1.exercise2.model;

import level1.exercise2.interfaces.IbuilderPizza;


import java.util.List;

public class ConcretePizzaBarbacue implements IbuilderPizza {
    private Pizza pizza;

    public ConcretePizzaBarbacue(){
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
        pizza.setDough("Roman");
    }
    @Override
    public void buildTopping(){
        pizza.setTopping(List.of("caramelized onion","minced meat","barbecue sauce","mozzarella","tomato sauce"));
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}


