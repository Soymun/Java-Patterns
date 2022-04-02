package behavior.ChaneofResponsobility;

public class SMSNotify extends Notify{
    public SMSNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String str) {
        System.out.println("Sending sms " + str);
    }
}
