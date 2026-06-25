public class Main {
    public static void main(String[] args) {
        System.out.println("=== University System ===");
        GradStudent gradStudent = new GradStudent("John", 25, 101, 3.8, "Machine Learning");
        System.out.println(gradStudent);

        System.out.println("\n=== Library Management ===");
        Author author = new Author("Java Fundamentals", 2023, "Robert Martin", "Expert in clean code");
        author.displayInfo();

        System.out.println("\n=== Order Management ===");
        DeliveredOrder deliveredOrder = new DeliveredOrder(1001, "2024-01-15", "TRK123456", "2024-01-20");
        System.out.println(deliveredOrder.getOrderStatus());

        System.out.println("\n=== Vehicle Management ===");
        ElectricVehicle ev = new ElectricVehicle(200, "Tesla Model 3", 75);
        ev.displayInfo();
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle(220, "BMW 320i", 60);
        pv.displayInfo();
        pv.refuel();

        System.out.println("\n=== Smart Home Devices ===");
        Thermostat thermostat = new Thermostat(1, "On", 22.5);
        thermostat.displayStatus();

        System.out.println("\n=== Educational Courses ===");
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Python Advanced", 12, "Udemy", true, 99.99, 20);
        paidCourse.displayCourseInfo();

        System.out.println("\n=== Restaurant Management ===");
        Chef chef = new Chef("Marco", 201, "Italian Cuisine");
        chef.performDuties();

        Waiter waiter = new Waiter("Alex", 202, "A");
        waiter.performDuties();
    }
}
