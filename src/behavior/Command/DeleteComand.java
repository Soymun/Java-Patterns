package behavior.Command;

public class DeleteComand implements Command{
    DateBase dateBase;

    public DeleteComand(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public void execute() {
        dateBase.delete();
    }
}
