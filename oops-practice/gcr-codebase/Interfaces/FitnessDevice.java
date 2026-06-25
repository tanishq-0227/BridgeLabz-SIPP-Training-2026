public class FitnessDevice implements Trackable, Reportable, Notifiable {
    private int stepsCount = 0;

    @Override
    public void logActivity(String activity) {
        stepsCount += 1000;
        System.out.println("Activity logged: " + activity + " | Total steps: " + stepsCount);
    }

    @Override
    public void generateReport() {
        System.out.println("Fitness Report - Steps: " + stepsCount + ", Calories: " + (stepsCount / 20));
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }

    @Override
    public void resetData() {
        stepsCount = 0;
        System.out.println("Fitness device data reset!");
    }
}
