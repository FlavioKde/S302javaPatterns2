package level3.exercise1.exception;

public class InvalidPaymentMethodException extends Exception {
    public InvalidPaymentMethodException(String message) {
        super(message);
    }
}
