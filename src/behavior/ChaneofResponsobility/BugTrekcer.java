package behavior.ChaneofResponsobility;

public class BugTrekcer {
    public static void main(String[] args) {
        Notify report = new SimpleRepotNotify(Priority.ROUTINE);
        Notify email = new EmaolNotify(Priority.IMPORTANT);
        Notify sms = new SMSNotify(Priority.ASAP);

        report.setNext(email);
        email.setNext(sms);

        report.notifyManager("GG VP", Priority.ASAP);
    }
}
