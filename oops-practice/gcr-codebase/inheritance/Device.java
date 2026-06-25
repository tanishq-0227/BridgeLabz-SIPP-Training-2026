public class Device {
    private int deviceId;
    private String status;

    public Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }

    public int getDeviceId() {
        return deviceId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
