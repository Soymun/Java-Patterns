package behavior.Observer;

public class JobSerch {
    public static void main(String[] args) {
        JavaDeveloper javaDeveloper = new JavaDeveloper();
        javaDeveloper.addVacancie("Java Junior");
        javaDeveloper.addVacancie("Java Senior");
        Observer observer1 = new Subscriber("Vlad");
        Observer observer2 = new Subscriber("Semyon");
        javaDeveloper.addObserver(observer1);
        javaDeveloper.addObserver(observer2);

        javaDeveloper.addVacancie("Java Midle");
    }
}
