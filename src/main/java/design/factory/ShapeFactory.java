package design.factory;

/**
 * @author chenzhangyan  on 2018/3/30.
 */
public class ShapeFactory {

    public Shape getShape(String shape) {
        if ("CIRCLE".equalsIgnoreCase(shape)) {
            return new Circle();
        } else if ("SQUARE".equalsIgnoreCase(shape)) {
            return new Square();
        }
        return null;
    }
}
