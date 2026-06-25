public class Vehicle {
    private String vehicleId;
    private String vehicleName;
    private int yearOfManufacture;
    private double price;
    private String status;

    public Vehicle(String vehicleId, String vehicleName, int yearOfManufacture, double price) {
        this.vehicleId = vehicleId;
        this.vehicleName = vehicleName;
        this.yearOfManufacture = yearOfManufacture;
        this.price = price;
        this.status = "Available";
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price!");
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status.equals("Available") || status.equals("Sold") || status.equals("Maintenance")) {
            this.status = status;
        } else {
            System.out.println("Invalid status!");
        }
    }

    public void displayVehicleInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Vehicle Name: " + vehicleName);
        System.out.println("Year: " + yearOfManufacture);
        System.out.println("Price: Rs. " + price);
        System.out.println("Status: " + status);
    }

    public int getAge() {
        return 2024 - yearOfManufacture;
    }

    public double getDepreciatedPrice() {
        int age = getAge();
        double depreciationRate = age * 0.05;
        return price * (1 - depreciationRate);
    }
}
