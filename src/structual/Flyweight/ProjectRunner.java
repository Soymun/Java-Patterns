package structual.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class ProjectRunner {
    public static void main(String[] args) {
        DeveloperFactory df = new DeveloperFactory();

        List<Developer> list = new ArrayList<>();

        list.add(df.getDeveloperBySpecialty("java"));
        list.add(df.getDeveloperBySpecialty("java"));
        list.add(df.getDeveloperBySpecialty("java"));
        list.add(df.getDeveloperBySpecialty("java"));
        list.add(df.getDeveloperBySpecialty("java"));
        list.add(df.getDeveloperBySpecialty("java"));
        for(Developer d: list){
            d.writeCode();
        }

    }
}
