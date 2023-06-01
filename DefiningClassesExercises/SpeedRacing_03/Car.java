package DefiningClassesExercises.SpeedRacing_03;

public class Car {

    private String model;

    private double fuelAmount;
    private double fuelCostPerKm;
    private int travelDistance;


    public Car(String model, double fuelAmount, double fuelCostPerKm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKm = fuelCostPerKm;
        this.travelDistance = 0; // Задаваме началната стойност

    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCostPerKm() {
        return fuelCostPerKm;
    }

    public int getTravelDistance() {
        return travelDistance;
    }

    public String getModel() {
        return model;

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public void setFuelCostPerKm(double fuelCostPerKm) {
        this.fuelCostPerKm = fuelCostPerKm;
    }

    public void setTravelDistance(int travelDistance) {
        this.travelDistance = travelDistance;



    }

    public boolean isFuelSufficient(int distance) {
        return this.fuelAmount >= neededFuel(distance);
    }
    private double neededFuel(int distance) {
        return this.fuelCostPerKm * distance;

    }
    public void reduceFuel(int distance) {
        this.fuelAmount -= neededFuel(distance);
    }
    public void increaseKm(int distance) {
        this.travelDistance += distance;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model,fuelAmount,travelDistance);
    }
}
