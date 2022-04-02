package creational.Bilder;

public class Programm {
    public static void main(String[] args) {
        WebSite webSite = new Director(new EnterpriceBuilder()).buildWebSite();
        System.out.println(webSite.toString());
    }
}
