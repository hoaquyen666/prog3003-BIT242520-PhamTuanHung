public class NotificationFactory {

    public static Notification createNotification(String channel) {
        if (channel == null) {
            return null;
        }

        switch (channel.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            default:
                System.out.println("null");
                return null;
        }
    }
}
