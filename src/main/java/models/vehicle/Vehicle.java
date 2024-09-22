package models.vehicle;

public abstract class Vehicle {

    private int vehicleNumber;
    private String color;

    public Vehicle(String color, int vehicleNumber) {
        this.color = color;
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
