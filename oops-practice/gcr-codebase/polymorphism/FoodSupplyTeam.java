public class FoodSupplyTeam extends RescueTeam {
    public FoodSupplyTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("Food Supply Team " + teamId + " at " + location + " - Distributing food supplies...");
    }
}
