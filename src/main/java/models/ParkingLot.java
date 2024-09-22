package models;

import models.slot.Slot;
import models.vehicle.Vehicle;
import strategy.payment.PaymentChargesStrategy;
import strategy.slot.SlotAssignStrategy;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    List<Floor> floorList;
    PaymentChargesStrategy paymentChargesStrategy;
    SlotAssignStrategy slotAssignStrategy;
    public static ParkingLot instance;

    private ParkingLot(int numberOfFloors , PaymentChargesStrategy paymentChargesStrategy, SlotAssignStrategy slotAssignStrategy){
        floorList = new ArrayList<>();
        for (int i=0;i<numberOfFloors;i++){
            Floor floor = new Floor(i+1);
            floorList.add(floor);
        }
        this.slotAssignStrategy = slotAssignStrategy;
        this.paymentChargesStrategy = paymentChargesStrategy;
    }

    public static ParkingLot getInstance(int numberOfFloors , PaymentChargesStrategy paymentChargesStrategy, SlotAssignStrategy slotAssignStrategy){
        if(instance==null){
            synchronized (ParkingLot.class){
                instance = new ParkingLot(numberOfFloors,paymentChargesStrategy,slotAssignStrategy);
            }
        }
        return instance;
    }

    public synchronized Ticket parkVehicle(Vehicle vehicle, User user){
        Ticket ticket = new Ticket(vehicle,user);
        Slot slot = slotAssignStrategy.assignSlot(floorList,vehicle);
        slot.setOccupied(true);
        ticket.setSlot(slot);
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(10);
        ticket.setExitTime(20);
        return ticket;
    }

    public Ticket payCharges(Ticket ticket){
        int amount  = paymentChargesStrategy.generateCharges(ticket);
        ticket.setAmount(amount);
        ticket.getSlot().setOccupied(false);
        return ticket;
    }
}
