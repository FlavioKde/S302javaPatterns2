package level3.exercise1.model;

import level3.exercise1.exception.InvalidPaymentMethodException;
import level3.exercise1.interfaces.IImplementPayment;
import level3.exercise1.interfaces.IPaymentContext;

public class PaymentServices implements IImplementPayment {
    IPaymentContext shoesStore;

    public PaymentServices(IPaymentContext shoesStore) {
        this.shoesStore = shoesStore;
    }


    @Override
    public PaymentTypeMethod methodPayment() throws InvalidPaymentMethodException {
        PaymentTypeMethod paymentType = shoesStore.getPaymentMethod();


        if (paymentType == null) {
            throw new InvalidPaymentMethodException("Debe ser un método de pago valido");

        }
        switch (paymentType) {
            case CASH -> System.out.println("procesando pago efectivo");
            case CREDIT_CARD -> System.out.println("procesando pago credit");
            case TRANSFER -> System.out.println("procesando transferencia");

        }
        return paymentType;
    }
}
