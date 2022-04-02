package behavior.Visitor;

public class Project implements ProjectElments{
    ProjectElments[] projectElments;

    public Project() {
        projectElments = new ProjectElments[]{
                new ProjectClass(),
                new DateBase(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for(ProjectElments projectElments1 : projectElments){
            projectElments1.beWritten(developer);
        }
    }
}
