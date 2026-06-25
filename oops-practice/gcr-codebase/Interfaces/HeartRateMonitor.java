public interface HeartRateMonitor {
    void monitorHeartRate(String patientId);

    default void displayHealthTips() {
        System.out.println("Health Tip: Maintain heart rate between 60-100 bpm at rest.");
    }
}
