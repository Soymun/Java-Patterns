package behavior.Command;

public class UpdateComand implements Command{
    DateBase dateBase;

    public UpdateComand(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public void execute() {
        dateBase.uppdate();
    }
}
