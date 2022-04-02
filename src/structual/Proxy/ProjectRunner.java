package structual.Proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new RealProject("https://www.ystu.ru/wprog/rasp/raspz1day.php");

        project.run();

    }
}
