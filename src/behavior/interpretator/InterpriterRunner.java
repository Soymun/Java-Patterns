package behavior.interpretator;

public class InterpriterRunner {
    public static void main(String[] args) {

    }
    public static Expression getJavaExpression(){
        Expression java = new TerribleExpression("java");
        Expression javacore = new TerribleExpression("java core");

        return new OrExpression(java, javacore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerribleExpression("java");
        Expression spring = new TerribleExpression("spring");

        return new AndExpression(java, spring);
    }
}
