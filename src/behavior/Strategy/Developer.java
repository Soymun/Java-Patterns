package behavior.Strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void JustDoIt(){
        activity.justDoIt();
    }
}
