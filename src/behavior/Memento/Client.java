package behavior.Memento;

public class Client {
    public static void main(String[] args) {
        Project project = new Project();
        GitHabRepo gitHabRepo = new GitHabRepo();
        System.out.println("Create new Project");
        project.setVersion("1.0");
        System.out.println("Saving project to git");
        gitHabRepo.setSave(project.save());

        project.setVersion("1.1");
        project.load(gitHabRepo.getSave());
        System.out.println(project.toString());
    }
}
