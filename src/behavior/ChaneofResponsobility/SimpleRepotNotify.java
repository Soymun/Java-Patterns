package behavior.ChaneofResponsobility;

public class SimpleRepotNotify extends Notify{
    public SimpleRepotNotify(int priority) {
        super(priority);
    }

    @Override
    public void write(String str) {
        System.out.println("Using simple report " + str );
    }
}
