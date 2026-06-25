public class PolymorphismDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. TRANSPORT FLEET ===");
        Vehicle[] fleet = {new Car(), new Bus(), new Bike(), new ElectricCar()};
        double totalCost = 0;
        for (Vehicle v : fleet) {
            double cost = v.fuelCost(100);
            System.out.println(v.getVehicleType() + " - Cost for 100 km: " + cost);
            totalCost += cost;
        }
        System.out.println("Total Cost: " + totalCost);

        System.out.println("\n=== 2. NOTIFICATION SYSTEM ===");
        Notification[] notifications = {
            new EmailNotification("Alice", "Welcome to our service"),
            new SMSNotification("Bob", "Your OTP is 12345"),
            new PushNotification("Charlie", "You have a new message")
        };
        for (Notification n : notifications) {
            n.sendNotification();
        }

        System.out.println("\n=== 3. GAME BATTLE ===");
        GameCharacter[] characters = {
            new Warrior("Aragorn"),
            new Mage("Gandalf"),
            new Archer("Legolas"),
            new Warrior("Boromir")
        };
        Battle.startBattle(characters);

        System.out.println("\n=== 4. LIBRARY SYSTEM ===");
        LibraryMember[] members = {
            new StudentMember("John", "S001"),
            new FacultyMember("Dr. Smith", "F001"),
            new GuestMember("Guest1", "G001")
        };
        LibrarySystem.printMemberDetails(members);
        LibrarySystem.calculateAndDisplayFines(members, 5);
        LibrarySystem.findMemberById(members, "F001");

        System.out.println("\n=== 5. TOLL SYSTEM ===");
        VehicleToll[] vehicles = {
            new CarToll("ABC123", "Rajesh"),
            new BusToll("BUS456", "Transport Co"),
            new TruckToll("TRUCK789", "Cargo Ltd"),
            new CarToll("XYZ999", "Priya")
        };
        System.out.println("Total Revenue: Rs. " + TollManagementSystem.calculateTotalRevenue(vehicles));
        TollManagementSystem.displayHighestToll(vehicles);
        TollManagementSystem.countVehiclesByType(vehicles);
        TollManagementSystem.searchVehicle(vehicles, "BUS456");

        System.out.println("\n=== 6. STREAMING PLATFORM ===");
        Subscription[] subscriptions = {
            new BasicPlan("Alice", "SUB001"),
            new PremiumPlan("Bob", "SUB002"),
            new FamilyPlan("Charlie", "SUB003"),
            new BasicPlan("David", "SUB004")
        };
        System.out.println("Total Monthly Revenue: $" + StreamingAnalyzer.calculateTotalRevenue(subscriptions));
        StreamingAnalyzer.findMostExpensive(subscriptions);
        StreamingAnalyzer.displayByNamePrefix(subscriptions, 'A');
        StreamingAnalyzer.searchById(subscriptions, "SUB002");

        System.out.println("\n=== 7. DISASTER RESCUE ===");
        RescueTeam[] teams = {
            new MedicalTeam("MED001", "City Hospital"),
            new FireRescueTeam("FIRE001", "North Area"),
            new FoodSupplyTeam("FOOD001", "South Area"),
            new MedicalTeam("MED002", "North Area"),
            new FireRescueTeam("FIRE002", "City Center")
        };
        DisasterManagement.performAllDuties(teams);
        DisasterManagement.countTeamsByType(teams);
        DisasterManagement.displayMaxDeployedCategory(teams);
        DisasterManagement.findTeamByLocation(teams, "North Area");
    }
}
