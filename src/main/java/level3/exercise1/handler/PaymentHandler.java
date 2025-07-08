package level3.exercise1.handler;


import level3.exercise1.exception.InvalidPaymentMethodException;
import level3.exercise1.interfaces.ICallback;
import level3.exercise1.interfaces.IImplementPayment;
import level3.exercise1.interfaces.Icommand;

public class PaymentHandler implements Icommand {
    private IImplementPayment shoesSales;

    public PaymentHandler(IImplementPayment shoesSales){
        this.shoesSales = shoesSales;
    }

    @Override
    public void execute(ICallback iCallback)  {

        try {
            shoesSales.methodPayment();
            iCallback.call();
            System.out.println("Transaction completed.");
        } catch (InvalidPaymentMethodException e) {
            System.out.println("the payment method is not valid" +e.getMessage());
        }

    }

    }

