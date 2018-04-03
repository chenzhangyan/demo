package design.builder;

/**
 * @author chenzhangyan  on 2018/4/3.
 */
public abstract class Burger implements Item {
    public Packing packing() {
        return new Wrapper();
    }
}
