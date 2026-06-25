public class TollManagementSystem {
    public static double calculateTotalRevenue(VehicleToll[] vehicles) {
        double total = 0;
        for (VehicleToll vehicle : vehicles) {
            total += vehicle.calculateToll();
        }
        return total;
    }

    public static void searchVehicle(VehicleToll[] vehicles, String vehicleNumber) {
        System.out.println("\n=== Search Result ===");
        for (VehicleToll vehicle : vehicles) {
            if (vehicle.getVehicleNumber().equals(vehicleNumber)) {
                System.out.println("Found: " + vehicle.getOwnerName() + " - Toll: Rs. " + vehicle.calculateToll());
                return;
            }
        }
        System.out.println("Vehicle not found!");
    }

    public static void displayHighestToll(VehicleToll[] vehicles) {
        System.out.println("\n=== Highest Toll ===");
        VehicleToll highest = vehicles[0];
        for (VehicleToll vehicle : vehicles) {
            if (vehicle.calculateToll() > highest.calculateToll()) {
                highest = vehicle;
            }
        }
        System.out.println("Vehicle: " + highest.getVehicleNumber() + ", Toll: Rs. " + highest.calculateToll());
    }

    public static void countVehiclesByType(VehicleToll[] vehicles) {
        System.out.println("\n=== Vehicle Count by Type ===");
        int cars = 0, buses = 0, trucks = 0;
        
        for (VehicleToll vehicle : vehicles) {
            if (vehicle instanceof CarToll) {
                cars++;
            } else if (vehicle instanceof BusToll) {
                buses++;
            } else if (vehicle instanceof TruckToll) {
                trucks++;
            }
        }
        
        System.out.println("Cars: " + cars);
        System.out.println("Buses: " + buses);
        System.out.println("Trucks: " + trucks);
    }
}
