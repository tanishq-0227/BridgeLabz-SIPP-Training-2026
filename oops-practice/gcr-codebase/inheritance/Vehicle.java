public class Vehicle {
    private double maxSpeed;
    private String model;

    public Vehicle(double maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " km/h, Model: " + model);
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public String getModel() {
        return model;
    }
}
