package behavior.interpretator;

public class OrExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    @Override
    public boolean interpred(String contex) {
        return expression1.interpred(contex) || expression2.interpred(contex);
    }
}
