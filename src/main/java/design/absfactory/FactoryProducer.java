package design.absfactory;

/**
 * @author chenzhangyan  on 2018/4/2.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if ("SHAPE".equalsIgnoreCase(factory)) {
            return new ShapeFactory();
        } else if ("COLOR".equalsIgnoreCase(factory)) {
            return new ColorFactory();
        }
        return null;
    }
}
