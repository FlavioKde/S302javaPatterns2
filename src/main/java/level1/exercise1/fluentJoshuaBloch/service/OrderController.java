package level1.exercise1.fluentJoshuaBloch.service;

import level1.exercise1.fluentJoshuaBloch.model.ConcretePizzaBarbecue;
import level1.exercise1.fluentJoshuaBloch.model.ConcretePizzaCatalan;
import level1.exercise1.fluentJoshuaBloch.model.ConcretePizzaHawaiian;
import level1.exercise1.fluentJoshuaBloch.model.Pizza;

public class OrderController {

    public static void menu() {
        Pizza pizza = new ConcretePizzaHawaiian()
                .setSize("Medium")
                .setDough("Neapolitian")
                .addTopping("Mozzarella")
                .addTopping("pineapple")
                .addTopping("ham")
                .build();
        pizza.displayInfo();

        Pizza pizza1 = new ConcretePizzaBarbecue()
                .setSize("Extra large")
                .setDough("American")
                .addTopping("Mozzarella")
                .addTopping("caramelized onion")
                .addTopping("minced meat")
                .addTopping("barbecue sauce")
                .build();
        pizza1.displayInfo();

        Pizza pizza2 = new ConcretePizzaCatalan()
                .setSize("Medium")
                .setDough("Roman")
                .addTopping("Mozzarella")
                .addTopping("caramelized onion")
                .addTopping("white sausage")
                .addTopping("black sausage")
                .addTopping("thyme")
                .build();
        pizza2.displayInfo();
    }
}
