package behavior.Mediator;

public class SimpleChatRunner {
    public static void main(String[] args) {
        SimpleTextChat simpleChatRunner = new SimpleTextChat();
        Admin admin = new Admin(simpleChatRunner, "admin");

        User user1 = new SimpleUser(simpleChatRunner, "user1");
        User user2 = new SimpleUser(simpleChatRunner, "user2");

        simpleChatRunner.setAdmin(admin);
        simpleChatRunner.addUser(user1);
        simpleChatRunner.addUser(user2);

        user1.sendMassage("Hello");
    }
}
