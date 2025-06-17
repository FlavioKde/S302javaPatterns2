package level1.exercise2.service;

import level1.exercise2.logic.DirectorPizzaBuilder;
import level1.exercise2.model.ConcretePizzaBarbacue;
import level1.exercise2.model.ConcretePizzaCatalan;
import level1.exercise2.model.ConcretePizzaHawaiian;
import level1.exercise2.model.Pizza;

public class OrderController {

    public static void menu(){

        DirectorPizzaBuilder director = new DirectorPizzaBuilder();

        Pizza pizzaHawaiian = director.construct(new ConcretePizzaHawaiian());
        pizzaHawaiian.displayInfo();

        Pizza pizzaBarbecue = director.construct(new ConcretePizzaBarbacue());
        pizzaBarbecue.displayInfo();

        Pizza pizzaCatalan = director.construct(new ConcretePizzaCatalan());
        pizzaCatalan.displayInfo();
    }
}
