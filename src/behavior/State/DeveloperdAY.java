package behavior.State;

public class DeveloperdAY {
    public static void main(String[] args) {
        Activity activity = new Sleep();
        Developer javadeveloper = new Developer();
        javadeveloper.setActivity(activity);
        for(int i = 0;i<10;i++){
            javadeveloper.JustDoIt();
            javadeveloper.changeActivity();
        }
    }
}
