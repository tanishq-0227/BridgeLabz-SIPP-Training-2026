public class FireRescueTeam extends RescueTeam {
    public FireRescueTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("Fire Rescue Team " + teamId + " at " + location + " - Extinguishing fire...");
    }
}
