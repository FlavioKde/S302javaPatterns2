package level3.exercise1.model;

import level3.exercise1.handler.PaymentHandler;
import level3.exercise1.interfaces.ICallback;
import level3.exercise1.interfaces.IPaymentCallback;

public class TicketSales implements ICallback {
    private PaymentHandler icommand;
    private IPaymentCallback iPaymentCallback;

    public TicketSales(PaymentHandler icommand, IPaymentCallback iPaymentCallback){
        this.icommand = icommand;
        this.iPaymentCallback = iPaymentCallback;

    }

    @Override
    public void call() {

        System.out.println("The order ticket is printed");
        iPaymentCallback.onPaymentCompleted(true);
    }
    public void startSale() {

        icommand.execute(this);

    }

}
