package behavior.Visitor;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();
        Developer jun = new JuniorDeveloper();
        Developer sen = new SeniorDeveloper();
        project.beWritten(jun);
        project.beWritten(sen);
    }
}
