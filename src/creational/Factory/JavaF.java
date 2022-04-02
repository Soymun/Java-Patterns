package creational.Factory;

public class JavaF implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {

        return new JavaDeveloper();
    }
}
