package design.interpreter;

/**
 * @author chenzhangyan  on 2018/5/4.
 */
public class TerminalExpression implements Expression {
    private String text;

    public TerminalExpression(String text) {
        this.text = text;
    }

    public boolean interpret(String context) {
        return context.contains(text);
    }
}
