package models;

import models.slot.BikeSlot;
import models.slot.CarSlot;
import models.slot.Slot;

import java.util.ArrayList;
import java.util.List;

public class Floor {

    int floorNumber;
    List<Slot> slotList;

    public Floor(int floorNumber){
        this.floorNumber = floorNumber;
        slotList = new ArrayList<>();
        for(int i=0;i<10;i++){
            Slot slot = new CarSlot(floorNumber+i);
            slotList.add(slot);
        }
        for(int i=0;i<10;i++){
            Slot slot = new BikeSlot(floorNumber+i);
            slotList.add(slot);
        }
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<Slot> getSlots() {
        return slotList;
    }

    public void setSlots(List<Slot> slots) {
        this.slotList = slots;
    }
}
