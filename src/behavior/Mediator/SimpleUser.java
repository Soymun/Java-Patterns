package behavior.Mediator;

public class SimpleUser implements  User{
    Chat chat;
    String name;

    public SimpleUser(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMassage(String massage) {
        chat.sendMassage(massage,this);
    }

    @Override
    public void getMassage(String massage) {
        System.out.println(massage);
    }
}
