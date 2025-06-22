package level3.exercise1.model;

import level3.exercise1.interfaces.IPaymentContext;

public abstract class ShoesStoreCentral implements IPaymentContext {
    private PaymentTypeMethod paymentType;
    private String shoesName;
    private double shoesSize;
    private double price;

    public ShoesStoreCentral(PaymentTypeMethod paymentType, String shoesName, double shoesSize, double price ){
        this.paymentType = paymentType;
        this.shoesName = shoesName;
        this.shoesSize = shoesSize;
        this.price = price;

    }

    public PaymentTypeMethod getPaymentType() {
        return paymentType;
    }


    public String getShoesName() {
        return shoesName;
    }

    public double getShoesSize() {
        return shoesSize;
    }

    public double getPrice() {
        return price;
    }



    @Override
    public String toString() {
        return "ShoesStoreCentral{" +
                "paymentType='" + paymentType + '\'' +
                ", shoesName='" + shoesName + '\'' +
                ", shoesSize=" + shoesSize +
                ", price=" + price +
                '}';
    }
}
