package level3.exercise1.model;

import level3.exercise1.handler.PaymentHandler;
import level3.exercise1.interfaces.ICallback;

public class TicketSales implements ICallback {
    private PaymentHandler icommand;

    public TicketSales(PaymentHandler icommand){
        this.icommand = icommand;

    }

    @Override
    public void call() {

        System.out.println("Se imprime el ticket de la comanda");
    }
    public void startSale() {

        icommand.execute(this);

    }

}
