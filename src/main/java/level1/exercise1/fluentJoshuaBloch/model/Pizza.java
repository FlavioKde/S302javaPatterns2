package level1.exercise1.fluentJoshuaBloch.model;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    Pizza(String size, String dough, List<String> toppings){
        this.size = size;
        this.dough = dough;
        this.toppings= List.copyOf(toppings);

    }
    public String getSize() { return size; }

    public String getDough() { return dough; }

    public List<String> getToppings() { return toppings; }


    public void displayInfo(){
        System.out.println("Order Pizza:");
        System.out.println("Size: " + getSize());
        System.out.println("Dough: " + getDough());
        System.out.println("Toppings: " + getToppings());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", size='" + size + '\'' +
                ", topping=" + toppings +
                '}';
    }
}
