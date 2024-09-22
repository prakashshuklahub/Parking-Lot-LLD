package org.example;

import models.*;
import models.vehicle.Car;
import models.vehicle.Vehicle;
import strategy.slot.NearestSlotStrategy;
import strategy.payment.WeekendPaymentStrategy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ParkingLotApplication {
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(3, new WeekendPaymentStrategy(),new NearestSlotStrategy());
        Vehicle swift = new Car("Red",12123);
        User user = new User(2003312,"prakash");
        Ticket ticket = parkingLot.parkVehicle(swift,user);
        parkingLot.payCharges(ticket);
        System.out.println(ticket.getUser().getName() + " pay this amount "+ticket.getAmount()+" for vehicle "+ticket.getVehicle().getVehicleNumber());
    }
}