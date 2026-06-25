public abstract class RescueTeam {
    protected String teamId;
    protected String location;

    public RescueTeam(String teamId, String location) {
        this.teamId = teamId;
        this.location = location;
    }

    public abstract void performDuty();

    public String getTeamId() {
        return teamId;
    }

    public String getLocation() {
        return location;
    }
}
