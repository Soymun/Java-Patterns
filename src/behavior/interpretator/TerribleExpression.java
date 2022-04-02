package behavior.interpretator;

public class TerribleExpression implements Expression{
    private String data;

    public TerribleExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpred(String contex) {
        if(data.contains(contex)){
            return true;
        }
        else {
            return false;
        }
    }
}
