package structual.Adapter;

public class DBRunner {
    public static void main(String[] args) {
        DateBase dateBase = new Adapter();
        dateBase.insert();
        dateBase.update();
        dateBase.select();
        dateBase.remove();
    }

}
