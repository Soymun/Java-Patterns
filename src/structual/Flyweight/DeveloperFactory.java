package structual.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();
    public Developer getDeveloperBySpecialty(String str){
        Developer developer = developers.get(str);

        if(developer == null){
            switch (str){
                case "java":
                    System.out.println("Hiring Java developer...");
                    developer = new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hiring c++ developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(str, developer);
        }
        return developer;
    }
}
