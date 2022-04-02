package behavior.Strategy;

public class Sleep implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleep");
    }
}
