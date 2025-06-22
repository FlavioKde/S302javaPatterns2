package level3.exercise1.model;


public class ShoesStore extends ShoesStoreCentral {

    public ShoesStore(PaymentTypeMethod paymentType, String shoesName, double shoesSize, double price ){
        super(paymentType, shoesName, shoesSize, price);

    }
    @Override
    public PaymentTypeMethod getPaymentMethod(){
        return getPaymentType();
    };
}
