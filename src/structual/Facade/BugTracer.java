package structual.Facade;

public class BugTracer {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint(){
        System.out.println("Start sprint..");
        activeSprint = true;
    }
    public  void  finishSprint(){
        System.out.println("Finish sprint...");
        activeSprint = false;
    }
}
