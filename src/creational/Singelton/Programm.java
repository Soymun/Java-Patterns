package creational.Singelton;

public class Programm {
    public static void main(String[] args) {
        JavaDeveloper jd = JavaDeveloper.getJavaDeveloper();
        jd.addCount();
        JavaDeveloper jd1 = JavaDeveloper.getJavaDeveloper();
        System.out.println(jd1.getCount());

    }
}
