public class DisasterManagement {
    public static void findTeamByLocation(RescueTeam[] teams, String location) {
        System.out.println("\n=== Teams at " + location + " ===");
        for (RescueTeam team : teams) {
            if (team.getLocation().equals(location)) {
                System.out.println("Team: " + team.getTeamId());
            }
        }
    }

    public static void displayTeamsByPrefix(RescueTeam[] teams, String prefix) {
        System.out.println("\n=== Teams starting with " + prefix + " ===");
        for (RescueTeam team : teams) {
            if (team.getTeamId().startsWith(prefix)) {
                System.out.println(team.getTeamId() + " - Location: " + team.getLocation());
            }
        }
    }

    public static void performAllDuties(RescueTeam[] teams) {
        System.out.println("\n=== Performing Duties ===");
        for (RescueTeam team : teams) {
            team.performDuty();
        }
    }

    public static void countTeamsByType(RescueTeam[] teams) {
        System.out.println("\n=== Team Count by Type ===");
        int medical = 0, fire = 0, food = 0;
        
        for (RescueTeam team : teams) {
            if (team instanceof MedicalTeam) {
                medical++;
            } else if (team instanceof FireRescueTeam) {
                fire++;
            } else if (team instanceof FoodSupplyTeam) {
                food++;
            }
        }
        
        System.out.println("Medical Teams: " + medical);
        System.out.println("Fire Rescue Teams: " + fire);
        System.out.println("Food Supply Teams: " + food);
    }

    public static void displayMaxDeployedCategory(RescueTeam[] teams) {
        System.out.println("\n=== Maximum Deployment Category ===");
        int medical = 0, fire = 0, food = 0;
        
        for (RescueTeam team : teams) {
            if (team instanceof MedicalTeam) {
                medical++;
            } else if (team instanceof FireRescueTeam) {
                fire++;
            } else if (team instanceof FoodSupplyTeam) {
                food++;
            }
        }
        
        int max = Math.max(medical, Math.max(fire, food));
        if (max == medical) {
            System.out.println("Medical Teams have maximum deployments: " + medical);
        } else if (max == fire) {
            System.out.println("Fire Rescue Teams have maximum deployments: " + fire);
        } else {
            System.out.println("Food Supply Teams have maximum deployments: " + food);
        }
    }
}
