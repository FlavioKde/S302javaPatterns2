package level3.exercise1.interfaces;

import level3.exercise1.model.PaymentTypeMethod;
import level3.exercise1.exception.InvalidPaymentMethodException;


public interface IImplementPayment {
    PaymentTypeMethod methodPayment() throws InvalidPaymentMethodException;
}
