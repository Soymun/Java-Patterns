package behavior.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SimpleTextChat implements Chat{
    Admin admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public void addUser(User user){
        users.add(user);
    }
    @Override
    public void sendMassage(String massage, User user) {
        for(User u: users){
            if(u != user){
                u.getMassage(massage);
            }
        }
        admin.getMassage(massage);
    }
}
