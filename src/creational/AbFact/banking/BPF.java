package creational.AbFact.banking;

import creational.AbFact.Developer;
import creational.AbFact.ProjectManager;
import creational.AbFact.ProjectTeamF;
import creational.AbFact.Tester;

public class BPF implements ProjectTeamF {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getManager() {
        return new PM();
    }
}
