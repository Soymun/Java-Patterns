package behavior.Command;

public class DataBaseRunner {
    public static void main(String[] args) {
        DateBase dateBase = new DateBase();
        Developer developer = new Developer(new InsertComand(dateBase), new UpdateComand(dateBase), new SelectComand(dateBase), new DeleteComand(dateBase));
        developer.insert();
        developer.update();
        developer.select();
        developer.delete();
    }
}
