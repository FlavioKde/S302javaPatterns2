package level3.exercise1.model;

import level3.exercise1.exception.InvalidPaymentMethodException;
import level3.exercise1.interfaces.IImplementPayment;
import level3.exercise1.interfaces.IPaymentContext;

public class ShoesSales implements IImplementPayment {
    IPaymentContext shoesStore;
    PaymentServices paymentServices;

    public ShoesSales(IPaymentContext shoesStore, PaymentServices paymentServices) {
        this.shoesStore = shoesStore;
        this.paymentServices = paymentServices;
    }

    public PaymentTypeMethod methodPayment() throws InvalidPaymentMethodException {

        return paymentServices.methodPayment();

    }
}
