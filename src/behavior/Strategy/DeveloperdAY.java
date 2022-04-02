package behavior.Strategy;

public class DeveloperdAY {
    public static void main(String[] args) {
        Developer javadeveloper = new Developer();
        javadeveloper.setActivity(new Sleep());
        javadeveloper.JustDoIt();
        javadeveloper.setActivity(new Training());
        javadeveloper.JustDoIt();
    }
}
