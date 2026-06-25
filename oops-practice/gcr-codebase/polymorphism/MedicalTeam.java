public class MedicalTeam extends RescueTeam {
    public MedicalTeam(String teamId, String location) {
        super(teamId, location);
    }

    @Override
    public void performDuty() {
        System.out.println("Medical Team " + teamId + " at " + location + " - Providing medical assistance...");
    }
}
