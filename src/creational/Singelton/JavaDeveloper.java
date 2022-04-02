package creational.Singelton;

public class JavaDeveloper {
    static JavaDeveloper javaDeveloper;
    static JavaDeveloper getJavaDeveloper(){
        if(javaDeveloper == null){
            javaDeveloper =  new JavaDeveloper();
        }
        return javaDeveloper;
    }
    private int count = 0;
    public JavaDeveloper() {
    }

    public int getCount() {
        return count;
    }
    public void addCount(){
        count++;
    }
}
