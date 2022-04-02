package behavior.Mediator;

public class Admin implements User{
    Chat chat;
    String name;

    public Admin(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void sendMassage(String massage) {
        chat.sendMassage(massage, this);
    }

    @Override
    public void getMassage(String massage) {
        System.out.println(this.name + "recervece massage" + massage);
    }
}
