package behavior.Visitor;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class");
    }

    @Override
    public void create(DateBase dateBase) {
        System.out.println("Fix database");
    }

    @Override
    public void create(Test test) {
        System.out.println("Create good test");
    }
}
