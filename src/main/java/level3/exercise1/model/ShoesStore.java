package level3.exercise1.model;


import level3.exercise1.interfaces.IPaymentContext;

public class ShoesStore extends ShoesStoreCentral implements IPaymentContext {

    public ShoesStore(PaymentTypeMethod paymentType, String shoesName, double shoesSize, double price ){
        super(paymentType, shoesName, shoesSize, price);

    }
    @Override
    public PaymentTypeMethod getPaymentMethod(){
        return getPaymentType();
    };

    @Override
    public void onPaymentCompleted(boolean success) {
        System.out.println("Payment status: " + success);
    }
}
