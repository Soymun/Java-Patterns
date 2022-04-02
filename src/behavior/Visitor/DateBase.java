package behavior.Visitor;

public class DateBase implements ProjectElments{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
