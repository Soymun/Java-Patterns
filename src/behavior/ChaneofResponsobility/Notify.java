package behavior.ChaneofResponsobility;

public abstract class Notify {
    private int priority;
    private Notify next;

    public Notify(int priority) {
        this.priority = priority;
    }

    public void setNext(Notify next) {
        this.next = next;
    }

    public void notifyManager(String message, int level){
        if(level >= priority){
            write(message);
        }
        if(next != null){
            next.notifyManager(message, level);
        }
    }
    public abstract void write(String str);
}
