package strategy.slot;

import models.*;
import models.slot.BikeSlot;
import models.slot.CarSlot;
import models.slot.Slot;
import models.vehicle.Bike;
import models.vehicle.Car;
import models.vehicle.Vehicle;

import java.util.List;

public class NearestSlotStrategy implements SlotAssignStrategy {

    @Override
    public Slot assignSlot(List<Floor> floors, Vehicle vehicle) {
        Floor nearestFloor = floors.get(0);
        List<Slot> slots = nearestFloor.getSlots();
        for(Slot slot:slots){
            if(slot.isOccupied())continue;
            if(vehicle instanceof Bike && slot instanceof BikeSlot){
                return slot;
            }else if(vehicle instanceof Car && slot instanceof CarSlot){
                return slot;
            }
        }
        return null;
    }
}
