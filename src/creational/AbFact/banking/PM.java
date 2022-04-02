package creational.AbFact.banking;

import creational.AbFact.ProjectManager;

public class PM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Manager manages project...");
    }
}
