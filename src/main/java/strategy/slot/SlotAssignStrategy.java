package strategy;

import models.Floor;
import models.Slot;
import models.Vehicle;

import java.util.List;

public interface SlotAssignStrategy {

    public Slot assignSlot(List<Floor> floors, Vehicle vehicle);
}
