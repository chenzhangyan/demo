package design.interpreter;

/**
 * @author chenzhangyan  on 2018/5/4.
 */
public class OrExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    public OrExpression(Expression exp1, Expression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    public boolean interpret(String context) {
        return exp1.interpret(context) || exp2.interpret(context);
    }
}
