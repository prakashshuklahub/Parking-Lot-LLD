package models;

import strategy.PaymentChargesStrategy;
import strategy.SlotAssignStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<Floor> floorList;
    PaymentChargesStrategy paymentChargesStrategy;
    SlotAssignStrategy slotAssignStrategy;

    public ParkingLot(int numberOfFloors , PaymentChargesStrategy paymentChargesStrategy, SlotAssignStrategy slotAssignStrategy){
        floorList = new ArrayList<>();
        for (int i=0;i<numberOfFloors;i++){
            Floor floor = new Floor(i+1);
            floorList.add(floor);
        }
        this.slotAssignStrategy = slotAssignStrategy;
        this.paymentChargesStrategy = paymentChargesStrategy;
    }

    public Ticket parkVehicle(Vehicle vehicle,User user){
        Ticket ticket = new Ticket(vehicle,user);
        Slot slot = slotAssignStrategy.assignSlot(floorList,vehicle);
        ticket.setSlot(slot);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(10);
        ticket.setExitTime(20);
        return ticket;
    }

    public Ticket payCharges(Ticket ticket){
        int amount  = paymentChargesStrategy.generateCharges(ticket);
        ticket.setAmount(amount);
        return ticket;
    }
}
