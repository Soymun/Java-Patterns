package creational.Factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory dp = new JavaF();
        Developer jd = dp.createDeveloper();
        jd.writeCode();
    }
}
