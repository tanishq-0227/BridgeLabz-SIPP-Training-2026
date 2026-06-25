public class Thermostat extends Device {
    private double temperatureSetting;

    public Thermostat(int deviceId, String status, double temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

    public double getTemperatureSetting() {
        return temperatureSetting;
    }

    public void setTemperatureSetting(double temperature) {
        this.temperatureSetting = temperature;
    }
}
