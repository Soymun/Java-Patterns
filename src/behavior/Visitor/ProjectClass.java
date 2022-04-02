package behavior.Visitor;

public class ProjectClass implements ProjectElments{
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
