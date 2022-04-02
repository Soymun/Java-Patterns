package behavior.Command;

public class SelectComand implements Command{
    DateBase dateBase;

    public SelectComand(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public void execute() {
        dateBase.select();
    }
}
