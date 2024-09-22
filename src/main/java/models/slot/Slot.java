package models.slot;

public abstract class Slot {

    int slotNumber;
    boolean occupied;

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    Slot(int slotNumber){
        this.slotNumber = slotNumber;
    }
}
