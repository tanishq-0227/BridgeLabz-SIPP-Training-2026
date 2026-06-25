public abstract class Notification {
    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public abstract void sendNotification();

    public String getRecipientName() {
        return recipientName;
    }

    public String getMessage() {
        return message;
    }
}
