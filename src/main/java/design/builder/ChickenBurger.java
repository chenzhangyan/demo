package design.builder;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public class ChickenBurger extends Burger {
    public String name() {
        return "chicken-burger";
    }

    public double price() {
        return 15;
    }
}
