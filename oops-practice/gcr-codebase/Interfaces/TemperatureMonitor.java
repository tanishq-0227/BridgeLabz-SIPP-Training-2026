public interface TemperatureMonitor {
    void monitorTemperature(String patientId);

    default void displayHealthTips() {
        System.out.println("Health Tip: Normal body temperature is 98.6°F (37°C).");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.length() >= 5 && patientId.matches("[A-Z0-9]+");
    }
}
