public class Main {

    public static void main(String[] args)
    {

        Notification notification = new Notification();

        // Dùng Email
        notification.setMessageService(new EmailService());
        notification.notifyUser("Email");

        notification.setMessageService(new SMSService());
        notification.notifyUser("SMS");
    }
}
