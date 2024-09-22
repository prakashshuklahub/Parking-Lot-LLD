package strategy.payment;

import models.Ticket;

public interface PaymentChargesStrategy {

     int generateCharges(Ticket ticket);
}
