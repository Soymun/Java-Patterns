package behavior.Visitor;

public interface Developer {
    public void create(ProjectClass projectClass);
    public void create(DateBase dateBase);
    public void create(Test test);

}
