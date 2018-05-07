package design.interpreter;

/**
 * @author chenzhangyan  on 2018/5/4.
 */
public interface Expression {
    boolean interpret(String context);
}
