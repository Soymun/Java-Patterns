package behavior.ChaneofResponsobility;

public class EmaolNotify extends Notify{
    public EmaolNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String str) {
        System.out.println("Sending email" + str);
    }
}
