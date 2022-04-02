package behavior.Command;

public class InsertComand implements Command{
    DateBase dateBase;

    public InsertComand(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public void execute() {
        dateBase.insert();
    }
}
