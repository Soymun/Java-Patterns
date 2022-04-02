package structual.Composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Developer> list = new ArrayList<>();

    public void addDeveloper(Developer developer){
        list.add(developer);
    }

    public void removeDeveloper(Developer developer){
        list.remove(developer);
    }

    public void  createProject(){
        System.out.println("Create project...");
        for(Developer d : list){
            d.writeCode();
        }
    }
}
