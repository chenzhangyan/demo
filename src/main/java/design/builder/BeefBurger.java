package design.builder;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public class BeefBurger extends Burger {
    public String name() {
        return "beef-burger";
    }

    public double price() {
        return 20;
    }
}
