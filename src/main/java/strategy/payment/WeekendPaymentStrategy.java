package strategy;

import models.Ticket;

public class WeekendPaymentStrategy implements PaymentChargesStrategy{
    @Override
    public int generateCharges(Ticket ticket) {
        int hours = ticket.getEntryTime()-ticket.getExitTime();
        hours = 20;
        int amount  = hours*100;
        return amount;
    }
}
