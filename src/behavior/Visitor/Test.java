package behavior.Visitor;

public class Test implements ProjectElments{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
