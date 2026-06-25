public class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    private String[] patientNames = {"John Doe", "Jane Smith", "Bob Wilson"};
    private String[] patientIds = {"P00001", "P00002", "P00003"};

    @Override
    public void monitorHeartRate(String patientId) {
        System.out.println("Monitoring heart rate for patient: " + patientId + " - 75 bpm");
    }

    @Override
    public void monitorTemperature(String patientId) {
        System.out.println("Monitoring temperature for patient: " + patientId + " - 37.2°C");
    }

    @Override
    public void displayHealthTips() {
        System.out.println("Health Tips: Stay hydrated and maintain regular exercise.");
    }

    public void validateAndMonitor(String patientId) {
        if (TemperatureMonitor.isPatientIdValid(patientId)) {
            monitorHeartRate(patientId);
            monitorTemperature(patientId);
        } else {
            System.out.println("Invalid patient ID: " + patientId);
        }
    }

    public void generateHealthReport() {
        System.out.println("\n=== Health Monitoring Report ===");
        displayHealthTips();
        System.out.println();
        
        for (int i = 0; i < patientIds.length; i++) {
            System.out.println("Patient: " + patientNames[i] + " (ID: " + patientIds[i] + ")");
            validateAndMonitor(patientIds[i]);
            System.out.println();
        }
    }
}
