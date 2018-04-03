package design.builder;

/**
 * @author chenzhangyan  on 2018/4/2.
 */
public abstract class Drink implements Item {
    public Packing packing() {
        return new Bottle();
    }


    public abstract double price();
}
