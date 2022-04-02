package behavior.Visitor;

public class JuniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Create bad class");
    }

    @Override
    public void create(DateBase dateBase) {
        System.out.println("Drop datebase");
    }

    @Override
    public void create(Test test) {
        System.out.println("Bad test");
    }
}
