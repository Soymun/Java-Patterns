package creational.Prototype;

public class ProjectF {
    Project project;

    public ProjectF(Project project) {
        this.project = project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
