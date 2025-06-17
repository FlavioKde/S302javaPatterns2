package level1.exercise2.model;

import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String>topping;

    Pizza(){

    }
    public Pizza(String size, String dough, List<String>topping){
        this.size = size;
        this.dough = dough;
        this.topping = topping;

    }

    public String getSize() {
        return size;
    }

    public String getDough() {
        return dough;
    }

    public List<String> getTopping() {
        return topping;
    }

    void setSize(String size) {
        this.size = size;
    }

    void setDough(String dough) {
        this.dough = dough;
    }

    void setTopping(List<String> topping) {
        this.topping = topping;
    }

    public void displayInfo(){
        System.out.println("Order Pizza:");
        System.out.println("Size: " + getSize());
        System.out.println("Dough: " + getDough());
        System.out.println("Toppings: " + getTopping());
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", dough='" + dough + '\'' +
                ", topping=" + topping +
                '}';
    }
}
