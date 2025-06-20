package level3.exercise1.model;

import level3.exercise1.interfaces.ICallback;
import level3.exercise1.interfaces.Icommand;

public class ShoesStore implements Icommand, ICallback {
    private String paymentType;
    private String shoesName;
    private double shoesSize;
    private double price;

    public ShoesStore(String paymentType, String shoesName, double shoesSize, double price ){
        this.paymentType = paymentType;
        this.shoesName = shoesName;
        this.shoesSize = shoesSize;
        this.price = price;

    }
    public String getShoesName() {
        return shoesName;
    }

    public double getShoesSize() {
        return shoesSize;
    }

    public void execute(Icommand comand,ICallback callback){
        if(paymentType.equalsIgnoreCase(" ") || paymentType.isEmpty()){
            System.out.println("debe escoger un metodo de pago");
            return;
        } else if (paymentType.equalsIgnoreCase("Credit card")) {
            

        }

        comand.execute();

    }
}
