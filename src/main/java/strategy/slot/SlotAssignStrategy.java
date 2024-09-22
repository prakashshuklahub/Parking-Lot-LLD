package strategy.slot;

import models.Floor;
import models.slot.Slot;
import models.vehicle.Vehicle;

import java.util.List;

public interface SlotAssignStrategy {

    public Slot assignSlot(List<Floor> floors, Vehicle vehicle);
}
