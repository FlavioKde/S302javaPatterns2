package level3.exercise1.logic;

import level3.exercise1.handler.PaymentHandler;
import level3.exercise1.interfaces.IPaymentCallback;
import level3.exercise1.model.*;

public class StoreSalesManager {

    public void runApp(){

        ShoesStore shoesStore = new ShoesStore(PaymentTypeMethod.CREDIT_CARD, "Tennis shoes",43.5,103.55);

        PaymentServices paymentServices = new PaymentServices(shoesStore);

        ShoesSales shoesSales = new ShoesSales(shoesStore, paymentServices);

        PaymentHandler handler = new PaymentHandler(shoesSales);

        TicketSales ticket = new TicketSales(handler,shoesStore);

        ticket.startSale();
    }
}

