package structual.Composite;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();
        Developer JD = new JavaDeveloper();
        Developer cd = new CppDeveloper();
        team.addDeveloper(JD);
        team.addDeveloper(cd);
        team.createProject();
    }
}
