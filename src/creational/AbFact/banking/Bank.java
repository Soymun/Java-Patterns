package creational.AbFact.banking;

public class Bank{
    public static void main(String[] args) {
        BPF bpf = new BPF();
        bpf.getDeveloper().writeCode();
        bpf.getTester().testCode();
        bpf.getManager().manageProject();

    }
}
