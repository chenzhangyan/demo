package design.interpreter;

/**
 * @author chenzhangyan  on 2018/5/4.
 */
public class Demo {
    public static void main(String[] args) {
        Expression son = new TerminalExpression("son");
        Expression girl = new TerminalExpression("girl");
        Expression child = new OrExpression(son, girl);//男孩女孩都是孩子

        Expression father = new TerminalExpression("father");
        Expression mather = new TerminalExpression("mather");
        Expression parents = new AndExpression(father, mather);//有爸爸有妈妈才是双亲健在

        System.out.println(child.interpret("son"));
        System.out.println(parents.interpret("father,mather"));
    }
}
