package design.builder;

/**
 * @author chenzhangyan  on 2018/4/2.
 */
public interface Item {
    String name();

    Packing packing();

    double price();
}
