package Exercise._02_VehicleExtension;

public class Bus extends Vehicle {
    private double emptyBusFuelCostPerKm;
    private double nonEmptyBusFuelCostPerKm;

    public Bus(double fuelQuantity, double fuelCostPerKm, double tankCapacity) {
        super(fuelQuantity, fuelCostPerKm, tankCapacity);
        this.emptyBusFuelCostPerKm = fuelCostPerKm;
        this.nonEmptyBusFuelCostPerKm = fuelCostPerKm + 1.4;
    }

    public String drive(double distance) {
        this.setFuelCostPerKm(nonEmptyBusFuelCostPerKm);
        return super.drive(distance);
    }

    public String driveEmpty(double distance) {
        this.setFuelCostPerKm(emptyBusFuelCostPerKm);
        return super.drive(distance);
    }
}
